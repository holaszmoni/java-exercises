package main;

import java.util.Scanner;


public class Main {

    // ex 4

    public static void main(String[] args) {

        printMyName();
        printSum();
        printDivision();
        printResults();
        printModel();
        printAverage(25,10, 12);
        printRest();
        printTemperature(120);
        printInput();
        printMetre();
        printSpeed(20,360,258, 600);




        //Calculator op =new Calculator();


// Pentru a testa aceasta metoda, mergeti in metoda main(), din clasa Main, si construiti un obiect de tip LogicalOp, si apelati metoda cu valori. Fiind o metoda de tip int, ea va returna o valoare, pe care noi trebuie sa o prindem si ca sa o vedem, trebuie sa o afisam in consola.
           //ex 2 if-else
            LogicalOp op = new LogicalOp();


            int biggest = op.checkBiggerNumber(25,18);
            System.out.println("The bigger number is: " + biggest);

            String printText  = op.printText();
            System.out.println(printText);

            String printValue = op.printValue();
            System.out.println(printValue);

            String printCm = op.printCm();
            System.out.println(printCm);

            String printNum = op.printNum();
            System.out.println(printNum);

            int x = op.LogicalOp();

            String isNumberEven = op.isNumberEven();
            System.out.println(isNumberEven);

            String isEligibleToVote = op.isEligibleToVote();
            System.out.println(isEligibleToVote);

             int max = op.printMax(6,10,5);
             System.out.println("The bigger number is: " + max);

         op.printNumbering(50);
         op.printNegative(55);
         op.Numbering(10, 25);
         op.printNumbers(5,35);
         op.printEven();
         op.printOdd();

         System.out.print(op.Sum(2));
         System.out.print(op.Med(91));
         op.printTipar("*");
         op.Numbers(10);
         op.Negative(-50);
         op.Parameters(10,60);
         op.Bigger(20,10);
         op.Even();
         op.Odd();
         op.CozaLozaWoza(110, 11);
         //op.Division(10, 21);
        op.Fibonacci();
        op.Grila();












        }





    //ex 1
    public static void printMyName() {
        System.out.println("Hello \n Moni");
    }

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

    //ex 3
    public static void printModel() {
        System.out.println(" +\"\"\"\"\"+ ");
        System.out.println("[| o o |]");
        System.out.println(" |  ^  | ");
        System.out.println(" | '-' | ");
        System.out.println(" +-----+ ");
    }

    public static float printAverage(float a, float b, float c) {
        float result = (a+b+c)/3;
        System.out.println(result);
        return result;
    }


    // ex 5
    public static double printRest() {
        int d = 2012;
        int e = 6;
        System.out.println(d%e);
        return (d % e);
    }

    // ex 6
    public static double printTemperature(double F) {
        double result =  5.0/9.0 * (F - 32);
        System.out.println(result);
        return result;

    }
    //ex 7
    public static void printMetre() {

        System.out.print("Input a value for inch: ");
        double inch = 2000;
        double meters = inch * 0.0254;
        System.out.println(inch + " inch is " + meters + " meters");
    }

    //ex 8
    public static void printSpeed(float dist, float ore, float min, float sec) {
        float seco = ore * 3600 + min * 60 + sec;
        float h = ore + min / 60.0f + sec / 3600.0f;
        System.out.println((float) (dist / seco) + " meters /sec");
        System.out.println((float) (dist / (1000 * h)) + " km / h");
        System.out.println((float) (dist / (1609.0f * h)) + " miles / h");
    }

    //ex 9
    public static void printInput() {
        Scanner io = new Scanner(System.in);
        System.out.println("Input the radius of the circle: ");
        double radius = 5;
        System.out.println("Perimeter is = " + (2 * radius * Math.PI));
        System.out.println("Area is = " + (Math.PI * radius * radius));
    }


}

