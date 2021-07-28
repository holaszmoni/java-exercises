package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LogicalOp {
    //ex3 if-else
    public static int checkBiggerNumber(int x, int y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }

    }

    //ex4 if-else
    public static String printText() {
        String text1 = "FastTrackIT";
        String text2 = "FastTrackIT";
        if (text1.equals(text2)) {
            text1 = "Learning text comparison";
            return text1;
        } else {
            text2 = "Got to try some more";
            return text2;
        }
    }

    //ex5 if-else
    public static String printValue() {
        String value1 = "FastTrackIT";
        int value2 = 3;
        if (value1.equals("FastTrackIT") && value2 <= 3) {
            // if (value2 <= 3)
            return (value1 + " " + value2);
        } else {
            return (value2 + " " + value1);
        }
    }

    //ex6 if-else
    public static String printCm() {
        int cm = 9;
        if (cm > 8 | cm == 6) {
            return ("The amount of snow this winter was(cm):" + " " + cm);
        } else {
            //System.out.println("The forecast snow is(cm):" + " " +cm);
            return ("The forecast snow is(cm):" + " " + cm);
        }
    }

    //ex 7 if-else
    public static String printNum() {
        int num = 2;
        if (num > 3 && num != 4) {
            return ("The mumber is greater than 3 and not equal to 4");
        } else if (num == 4) {
            return ("The number is equal to 4");
        } else if (num < 3) {
            return ("The number is lower than 3");
        }
        return null;
    }

    //ex 8 if-else
    public static int LogicalOp() {
        int x = 5;
        switch (x) {
            case 1:
                System.out.println("The number is:  1 !");
                break;
            case 2:
                System.out.println("The number is:  2 !");
                break;
            case 3:
                System.out.println("The number is:  3 !");
                break;
            case 4:
                System.out.println("The number is:  4 !");
                break;
            case 5:
                System.out.println("The number is:  5 !");
                break;
            case 6:
                System.out.println("The number is:  6 !");
                break;
            case 7:
                System.out.println("The number is:  7 !");
                break;
        }
        return x;
    }

    //ex 9 if-else
    public static String isNumberEven() {
        int number = 2;
        if (number % 2 == 0) {
            return ("TRUE");
        } else {
            return ("FALSE");
        }
    }

    //ex 10 if-else
    public static String isEligibleToVote() {
        int age = 17;
        if (age > 18) {
            return ("TRUE");
        } else {
            return ("FALSE");
        }
    }

    //ex 11 if-else
    public static int printMax(int n1, int n2, int n3) {
        if (n1 > n2 && n1 > n3) {
            return n1;
        } else if (n2 > n1 && n2 > n3) {
            return n2;
        } else {
            return n3;
        }
    }

    //ex 1 for
    public void printNumbering(int n) {
        for (int i = n; i < 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    //ex 2 for
    public void printNegative(int n) {
        if (n > -100) {
            for (int i = n; i > -100; i--) {
                System.out.print(i + " ");
            }
        } else {
            for (int i = n; i < -100; i++) {
                System.out.print(i + " ");
            }
        }

    }

    //ex 3 for
    public void Numbering(int z, int y) {
        System.out.println();
        for (int i = z; i <= y; i++) {
            System.out.print(i + " ");

        }

    }

    //ex 4 for
    public void printNumbers(int x, int y) {
        System.out.println();
        if (x > y) {
            for (int i = y; i <= x; i++) {
                System.out.print(i + " ");
            }
        } else if (x < y) {
            for (int i = x; i <= y; i++) {
                System.out.print(i + " ");
            }
        }

    }

    //ex 5 for
    public void printEven() {
        System.out.println();
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");

            }
        }
    }

    //ex 6 for
    public void printOdd() {
        System.out.println();
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }

    //    //ex 7 for
    public static int Sum(int x) {
        System.out.println();
        int total = 0;
        for (int i = 0; i <= x; i++) {
            total = total + i;
        }
        return total;
    }

    //ex 8 for
    public static int Med(int z) {
        System.out.println();
        int total = 0;
        for (int i = z; i <= 100; i++) {
            total = total + i;
        }
        return (total / (100 - z));
    }

    //ex 9 for
    public void printTipar(String z) {
        for (int i = 0; i < 7; i++) {
            System.out.println();
            for (int j = 7; j > i; j--) {
                System.out.print(z);
            }
        }
    }

    //ex 1 while
    public void Numbers(int t) {
        System.out.println();
        while (t <= 100) {
            System.out.print(t + " ");
            t++;
        }
    }

    //ex 2 while
    public void Negative(int u) {
        System.out.println();
        while (u >= -100) {
            System.out.print(u + " ");
            u--;
        }
    }

    //ex 3 while
    public void Parameters(int a, int b) {
        System.out.println();
        int i = a;
        while (i <= b) {
            System.out.print(i + " ");
            i++;
        }

    }

    //ex 4 while
    public void Bigger(int m, int n) {
        System.out.println();
        // int i = Math.max(m, n);
        while (m <= n) {
            System.out.print(m + " ");
            m++;
        }
        while (m >= n) {
            System.out.print(n + " ");
            n++;
        }
    }

    //ex 5 while
    public void Even() {
        System.out.println();

        int N = 1;
        while (N <= 100) {
            if (N % 2 == 0) {
                System.out.print(N + " ");
            }
            N++;
        }
    }

    //ex 6 while
    public void Odd() {
        System.out.println();

        int i = 1;
        while (i <= 100) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
            i++;
        }
    }

    //    //ex 7 while
//    public static void SumAverage(){
//        int x = 111;
//        int y = 8899;
//
//        }
    //ex 8 while
//    public static int Division(int a, int b) {
//        System.out.println();
//        for (int i = 1; i <= a; i++) {
//
//            if (i % 7 == 0) {
//            }
//            return (i);
//        }
//    }

    //ex 9 while
    public static void Fibonacci() {
        System.out.println();
        int n = 20, firstTerm = 0, secondTerm = 1;
        System.out.println("The first" + " " + n + " " + "Fibonacci numbers are:");
        for (int i = 1; i <= n; i++) {
            System.out.print(firstTerm + ", ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }


    //ex 10 while
    public static void CozaLozaWoza(int x, int y) {
        System.out.println();
        boolean choose;

        for (int i = 1; i <= x; i++) {
            choose = false;
            if (i % 3 == 0) {
                System.out.print("Coza");
                choose = true;
            }
            if (i % 5 == 0) {
                System.out.print("Loza");
                choose = true;
            }
            if (i % 7 == 0) {
                System.out.print("Woza");
                choose = true;
            }
            if (!choose) {
                System.out.print(i);
            }
            System.out.print(" ");
            if (i % 11 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    //ex 2 arrays
    public void writeOnArray(int[] arr) {
        if (arr.length > 100) {
            System.out.println("No space!");
        } else {
            for (int i = 0; i < 100; i++) {
                arr[i] = i + 1;
                System.out.println(arr[i]);
            }
        }
    }

    // ex 3 arrays
    public int[] evenArr(int[] arr) {
        int i1 = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                arr[i1++] = 1;
            }
        }
        return arr;
    }

    //ex 4 arrays
    public double Value(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return (double) sum / arr.length;
    }

    //ex 5 arrays

    public boolean Strings1(String[] strings, String str) {
        boolean find = false;
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].equals(str)) {
                find = true;
                break;
            }
        }
        return find;
    }

    //ex 6 arrays
    public int pozitie(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return i + 1;
            }
        }
        return -1;
    }

    //ex 7 arrays
    public static void Grila() {
        int[][] a = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%2d ", a[i][j]);
            }
            System.out.println();
        }
    }

    //ex 1 lists
    private static void populateIntList(List<Integer> variables) {
        variables.add(1);
        variables.add(2);
        variables.add(3);
        variables.add(4);
        variables.add(5);
        variables.add(6);

    }

    //ex 2 lists
    private static void Elements(List<Integer> list) {
        for (Integer item : list)
            System.out.println(item);
    }
}














