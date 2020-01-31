import java.util.Arrays;

public class SecondLesson {

    private static void changeArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            } else {
                array[i] = 1;
            }
        }
    }

    private static void plusThree(int[] array) {
        for (int i = 1; i < array.length; i++) {
            array[i] = array[i - 1] + 3;
        }
    }

    private static void everySixth(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            }
        }
    }

    private static void min(int[] array) {
        int maxValue;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) {
                maxValue = array[i];
            }
        }
    }

    private static int maxValue(int[] array) {
        int maxValue = 0;
        for (int i = 0; i < array.length; i++) {
            if (maxValue < array[i]) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }

    private static int minValue(int[] array) {
        int minValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (minValue > array[i]) {
                minValue = array[i];
            }
        }
        return minValue;
    }

    public static void main (String[] args) {

        /* 1 Задать целочисленный массив, состоящий из элементов 0 и 1.
        Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        Написать метод, заменяющий в принятом массиве 0 на 1, 1 на 0;
         */

        int[] array = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        System.out.println(Arrays.toString(array));
        changeArray(array);
        System.out.println(Arrays.toString(array));

        /* 2 Задать пустой целочисленный массив размером 8.
        Написать метод, который помощью цикла заполнит его значениями 1 4 7 10 13 16 19 22;
         */

        int[] array2 = new int[8];
        array2[0] = 1;
        plusThree(array2);
        System.out.println(Arrays.toString(array2));

        /* 3 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ],
        написать метод, принимающий на вход массив и умножающий числа меньше 6 на 2;
         */

        int[] array3 = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        everySixth(array3);
        System.out.println(Arrays.toString(array3));

        /*
        4 Задать одномерный массив. Написать методы поиска в нём минимального и максимального элемента;
        */
        int[] array5 = { 4, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        System.out.println(Arrays.toString(array5));
        int min = minValue(array5);
        int max = maxValue(array5);
        System.out.println(min);
        System.out.println(max);

    }
}
