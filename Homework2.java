import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Homework2 {

    public static void main(String[] args) {
        // 1 Дано четное число N (>0) и символы c1 и c2.
        // Написать метод, который вернет строку длины N, которая состоит из
        // чередующихся символов c1 и c2, начиная с c1.

        // Пример. (n = 6, c1='a', c2='b') -> "ababab"
        // (n = 8, c1='x', c2='y') -> "xyxyxyxy"
        System.out.println(buildString(9, 'a', 'b'));
        System.out.println(buildString1(9, 'a', 'b'));

        // 2 Создать файл file.txt. Если файл уже создан, ничего делать не надо.
        // Записать в файл слово TEXT 100 раз: TEXTTEXTTEXTTEXTTEXTTEXT...

        wordWriteToFile("file.txt", "TEXT", 100);

    }

    static String buildString(int n, char c1, char c2) {
        String result = "";
        if (n % 2 == 0) {
            for (int i = 0; i < n / 2; i++) {
                result += Character.toString(c1) + Character.toString(c2);
            }
        } else {
            for (int i = 0; i < n / 2; i++) {
                result += Character.toString(c1) + Character.toString(c2);
            }
            result += Character.toString(c1);
        }
        return result;
    }

    static String buildString1(int n, char c1, char c2) {
        StringBuilder result = new StringBuilder();
        if (n % 2 == 0) {
            for (int i = 0; i < n / 2; i++) {
                result.append(c1).append(c2);
            }
        } else {
            for (int i = 0; i < n; i++) {
                result.append((i % 2 != 0 ? c2 : c1));
                // if (i % 2 != 0) {
                // result.append(c2);
                // } else {
                // result.append(c1);
                // }
            }
        }
        return result.toString();
    }

    static void wordWriteToFile(String path, String word, int count) {
        try {
            Path filePath = Paths.get(path);
            if (!Files.exists(filePath)) {
                StringBuilder text = new StringBuilder();
                for (int i = 0; i < count; i++) {
                    text.append(word);
                }
                Files.writeString(filePath, text);
                // альтернатива блоку с 62 по 66 строку в строке 68
                // Files.writeString(filePath, word.repeat(count));
            } else {
                // если файл существует, то реализовал его удаление.
                Files.delete(filePath);
            }
        } catch (Exception e) {
            System.out.println(e.getClass().getName());
        }
    }
}
