package main;

import java.net.StandardSocketOptions;

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
        for(int i=n;i<100; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    //ex 2 for
    public void printNegative(int n) {
        if(n>-100){
            for(int i=n;i>-100; i--) {
                System.out.print(i + " ");
            }
        }
        else{
            for(int i=n;i<-100; i++) {
                System.out.print(i + " ");
            }
        }

    }
    //ex 3 for
    public void Numbering(int x, int y) {

    }
}

