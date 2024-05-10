package ru.netology.lessons;

/* Массивы Array */
// int[] - набор из интов, тип данных массив, поэтому квадратные скобки.
// int[] - массив из интов, arr - его имя. new int - создание нового массива [5] - размер.
// Чтобы красиво вывести на экран - Arrays.toString(arr) - в скобках имя массива.
// Тогда выводится [0, 0, 0, 0, 0].

import java.util.Arrays;

/*

public class Main {
    public static void main(String[] args) {
       int[] arr = new int[5];
       System.out.println(Arrays.toString(arr));
    }
}

*/


/* Меняем значение ячейки массива */
// arr[3] = это то, что мы меняем. После знака = то, на что меняем.
// [3] - в данном случае квадратные скобки говорят к какой ячейке мы обращаемся — 3-й.

// arr[3] = 5; — обращаемся на запись в 3-ю ячейку, записываем в неё значение — 5.

// System.out.println(arr[3]); - обращаемся на использование значения из 3-й ячейки [3] —
// То есть, выводим значение из 3-й ячейки — 5, на экран.

/*

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[3] = 5;
        System.out.println(arr[3]);
        System.out.println(Arrays.toString(arr));
    }
}

 */

/* Массивы типа String — ссылочного типа данных */

// String[] - набор из строк. Каждая ячейка будет хранить в себе строку.
// В типе данных String Java заполняет по умолчанию значения ячеек — null.
// По сути здесь хранится адрес, по которому ходить нельзя.

/*

public class Main {
    public static void main(String[] args) {
       String[] arr = new String[5];
       System.out.println(arr[0]);
    }
}

 */

/* Массивы типа String — ссылочного типа данных */

// String[] - набор из строк. Каждая ячейка будет хранить в себе строку.
// В типе данных String Java заполняет по умолчанию значения ячеек — null.
// По сути здесь хранится адрес, по которому ходить нельзя.

public class Main {
    public static void main(String[] args) {
        String[] arr = new String[5];
        System.out.println(arr[0]);
    }
}