package com.GekBrains;

public class HomeWorkApp {

    // Создаем првое приложение
    public static void main(String[] args) {
        System.out.println("Hello, Teacher.");
        System.out.println("Lesson 1.");
        System.out.println();
        System.out.println("Print tree list.");
        printThreeWords();
        System.out.println();
        System.out.println("checkSumSign.");
        checkSumSign(10, 20);
        checkSumSign(10, -10);
        checkSumSign(100,-200);
        System.out.println();
        System.out.println("printColor.");
        printColor(-10);
        printColor(100);
        printColor(101);
        System.out.println();
        System.out.println("compareNumbers.");
        compareNumbers(10, 50);
        compareNumbers(100, 7);
    }

    //Выводим наименования деревьев
    private static void printThreeWords() {
        System.out.println("Orange tree");
        System.out.println("Banana");
        System.out.println("Apple tree");
    }

    //Сравнение целых, метод
    private static void checkSumSign(int a, int b) {
        if ( (a + b) >= 0) {
            System.out.println("Сумма положительная (" + a + " + " + b + ")");
        } else {
            System.out.println("Сумма отрицательная (" + a + " + " + b + ")");
        }
    }

    //Метод распозначания и печати цвета
    private static void printColor(int num) {
        if (num <= 0) {
            System.out.println(num + " - Красный");
        } else if (num <=100) {
            System.out.println(num + " - Желтый");
        } else {
            System.out.println(num + " - Зеленый");
        }
    }

    //Сравнение номеров
    private static void compareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println("a>=b (" + a + ", " + b + ")");
        } else {
            System.out.println("a<b (" + a + ", " + b + ")");
        }
    }
}
