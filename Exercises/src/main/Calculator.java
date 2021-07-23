package main;

public class Calculator {
    public static void printSum() {
        int x = 10;
        int y = 20;
        System.out.println(x + y);
    }

    public static void printDivision() {
        System.out.println(10 / 3f);
    }

    public static void printResults() {
        System.out.println(-5 + 8 * 6);
        //exercise 4.b
        System.out.println((55 + 9) % 9);
        //exercise 4.c
        System.out.println(20 + -3 * 5 / 8);
        //exercise 4.d
        System.out.println(5 + 15 / 3 * 2 - 8 % 3);
    }
}