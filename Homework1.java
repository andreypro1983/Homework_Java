package Homework_Java;
import java.util.Arrays;
import java.util.Scanner;

public class Homework1 {

    public static void main(String[] args) {
        System.out.println(isSumBetween10And20(5, 15)); // true
        System.out.println(isSumBetween10And20(7, 9)); // false
        System.out.println(isSumBetween10And20(2, 6)); // false

        System.out.println(isPositive(5)); // true
        System.out.println(isPositive(-3)); // false

        printString("abcd", 5); // abcdabcdabcdabcdabcd

        System.out.println(isLeapYear(1994));
        System.out.println(isLeapYear(1988));
        System.out.println(isLeapYear(1992));

        System.out.println(Arrays.toString(createArray(5, 5)));

        int[] array1 = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        System.out.println(Arrays.toString(array1));
        binaryArrayReverse(array1);
        System.out.println(Arrays.toString(array1)); // [0, 0, 1, 1, 0, 1, 0, 0, 1, 1]

        int[] inputArray = getArrayFromConsole();
        System.out.println(Arrays.toString(inputArray));
        arrayChangeItemLess6(inputArray);
        System.out.println(Arrays.toString(inputArray));
        System.out.println("");

        int[][] arrayTwoDimensional = new int[5][5]; // [[1, 0, 0, 0], [0, 1, 0, 0], [0, 0, 1, 0], [0, 0, 0, 1]]
        feelDiagonalTwoDimentionalArray(arrayTwoDimensional);
        // System.out.println(Arrays.deepToString(arrayTwoDimensional));

    }

    /**
     * 1. Написать метод, принимающий на вход два целых числа и проверяющий,
     * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть
     * true, в противном случае – false.
     */
    private static boolean isSumBetween10And20(int a, int b) {
        // проверить, что сумма a и b лежит между 10 и 20
        return (a + b >= 10 && a + b <= 20);
    }

    private static boolean isPositive(int x) {
        // проверить, что х положительное
        return x >= 0;

    }

    private static void printString(String source, int repeat) {
        // напечатать строку source repeat раз
        String result = "";
        for (int i = 0; i < repeat; i++) {
            result += source;
        }
        System.out.println(result);

    }

    private static boolean isLeapYear(int year) {
        // проверить, является ли год високосным. если да - return true
        // год является високосным, если он делится на 4, но не делится на 100, но
        // делится на 400
        return ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
    }

    private static int[] createArray(int len, int initialValue) {
        // должен вернуть массив длины len, каждое значение которого равно initialValue
        int[] newArray = new int[len];
        for (int i = 0; i < len; i++) {
            newArray[i] = initialValue;
        }
        return newArray;
    }

    /**
     * 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
     * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия
     * заменить 0 на 1, 1 на 0;
     */
    private static void binaryArrayReverse(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0)
                array[i] = 1;
            else
                array[i] = 0;
        }
    }

    /*
     * 2. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему
     * циклом, и числа меньшие 6 умножить на 2;
     */
    private static int[] getArrayFromConsole() {
        Scanner iScaner = new Scanner(System.in);
        System.out.print("Введите размерность массива: ");
        int n = iScaner.nextInt();
        int[] newArray = new int[n];
        for (int i = 0; i < newArray.length; i++) {
            System.out.printf("Введите %d элемент массива: ", i);
            newArray[i] = iScaner.nextInt();
        }
        iScaner.close();
        return newArray;
    }

    private static void arrayChangeItemLess6(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6)
                array[i] = array[i] * 2;
        }
    }

    /*
     * 3. Создать квадратный двумерный целочисленный массив (количество строк и
     * столбцов одинаковое),
     * и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно
     * только одну из диагоналей, если обе сложно).
     * Определить элементы одной из диагоналей можно по следующему принципу: индексы
     * таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
     * * Также заполнить элементы побочной диагонали
     */

    private static void feelDiagonalTwoDimentionalArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if ((i == j) || (j == array.length - i - 1)) {
                    array[i][j] = 1;
                }
                System.out.print(array[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}