
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Homework4 {

    public static void main(String[] args) {
        // Реализовать приложение, которое:
        // Принимает от пользователя и запоминает строки
        // Если пользователь ввел print, то выводим все предыдущие строки в обратном
        // порядке
        // Если введено revert, то удаляем последнюю введеную строку
        // Если введено exit, то завершаем программу
        // > java
        // > c++
        // > python
        // > c#
        // > print
        // < [c#, python, c++, java]
        // > revert
        // > print
        // < [python, c++, java]
        // > exit

        Scanner cs = new Scanner(System.in);
        Deque<String> data = new ArrayDeque<String>();
        boolean isExit = false;
        while (!isExit) {
            System.out.println("Введите команду:");
            String word = cs.nextLine().toLowerCase();
            if (word.equals("print")) {
                System.out.println(data);

            } else if (word.equals("revert")) {
                if ((data.pollFirst()) == null) {
                    System.out.println("Отствуют данные для удаления");
                }

            } else if (word.equals("exit")) {
                System.out.println("До свидания!");
                isExit = true;
            } else {
                data.addFirst(word);
            }

        }
        cs.close();

    }

}
