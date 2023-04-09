import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class Homework5 {

    public static void main(String[] args) {
        System.out.println(isCorrectParentheses("()")); // true
        System.out.println(isCorrectParentheses("(")); // false
        System.out.println(isCorrectParentheses("())")); // false
        System.out.println(isCorrectParentheses("((()))")); // true
        System.out.println(isCorrectParentheses("()[]{}<>")); // true
        System.out.println(isCorrectParentheses("([)]")); // false
        System.out.println(isCorrectParentheses("][]")); // false
        System.out.println(isCorrectParentheses("[]{<()[]<>>}")); // true
        System.out.println(isCorrectParentheses("")); // false
    }

    /**
     * Дана последовательность скобочек. Проверить, что она является корректной.
     */
    static boolean isCorrectParentheses(String parentheses) {
        // TODO: 07.04.2023 Вписать решение!
        // Нужно завести маппинг скобочек либо ( -> ), либо ) -> ( и так для каждой пары
        // Нужно использовать Deque.
        // Открывающуюся скобку вносим в Deque (insertFirst)
        // Если встретилась закрывающаяся скобка, то (Deque#pollFirst) и сравниваем ее с
        // встретившейся
        Map<Character, Character> hashMap = new HashMap<>();
        hashMap.put(']', '[');
        hashMap.put('}', '{');
        hashMap.put(')', '(');
        hashMap.put('>', '<');
        char[] listChars = parentheses.toCharArray();
        if ((listChars.length % 2 != 0) || (listChars.length == 0)) {
            return false;
        } else {
            Deque<Character> stack = new ArrayDeque<>();
            for (int i = 0; i < listChars.length; i++) {
                if (!hashMap.containsKey(listChars[i])) {
                    stack.addFirst(listChars[i]);
                } else {
                    if ((stack.size() > 0) && (hashMap.get(listChars[i]) != stack.pollFirst())) {
                        return false;
                    }
                }
            }
            return true;
        }
    }
}
