import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Homework3 {
    public static void main(String[] args) {
        System.out.println("Задача1");
        
        ArrayList<Integer> numberList = new ArrayList<>(List.of(1, 3, 5, 3, 4, 5, 2, 6, 7, 8, 3, 33, 22, 1, 0));
        ArrayList<Integer> numberList1 = new ArrayList<>(numberList);

        System.out.println("Вариант1");

        System.out.println(numberList);
        removeEvenNumber(numberList);

        System.out.println("Вариант2");

        System.out.println(numberList1);
        removeEvenNumber1(numberList1);

        System.out.println("Задача2");

        List<String> strings = new ArrayList<>();
        strings.add("string");
        strings.add("40");
        strings.add("check");
        strings.add("0");
        strings.add("-5");
        strings.add("my_string");
        ArrayList<String> strings1 = new ArrayList<>(strings);

        System.out.println("Вариант1");

        System.out.println(strings);
        removeIntegers(strings);
        System.out.println(strings); // [string, my_string]

        System.out.println("Вариант2");

        System.out.println(strings1);
        removeIntegers1(strings1);
        System.out.println(strings1); // [string, my_string]
    }

    static void removeEvenNumber(List<Integer> numbers) {
        // TODO: 31.03.2023 Удалить все четные элементы из списка
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            int next = iterator.next();
            if (next % 2 == 0) {
                iterator.remove();
            }
        }
        System.out.println(numbers);
    }

    static void removeEvenNumber1(List<Integer> numbers) {
        // TODO: 31.03.2023 Удалить все четные элементы из списка
        numbers.removeIf(s -> (s % 2 == 0));
        System.out.println(numbers);
    }

    static void removeIntegers(List<String> strings) {
        // TODO: 31.03.2023 Удалить строки, которые являются целыми числами
        Iterator<String> iter = strings.iterator();
        while (iter.hasNext()) {
            String next = iter.next();
            try {
                Integer.parseInt(next);
                iter.remove();
            } catch (NumberFormatException e) {

            }
        }

    }

    static void removeIntegers1(List<String> strings) {
        // TODO: 31.03.2023 Удалить строки, которые являются целыми числами
        Iterator<String> iter = strings.iterator();
        while (iter.hasNext()) {
            String next = iter.next();
            char[] charArray = next.toCharArray();
            boolean isDigit = true;
            if ((charArray[0] == '-') || (Character.isDigit(charArray[0]))) {
                for (int i = 1; i < charArray.length; i++) {
                    if (!Character.isDigit(charArray[i])) {
                        isDigit = false;
                    }
                }
                if (isDigit) {
                    iter.remove();
                }
            }

        }

    }
}
