package org.accenture.day01.worksheet;

    /*
    TODO Complete and fix this class so that Day01WorksheetTests.java will pass.
        You are welcome to change anything in this class.
    */
public class Day01Worksheet {
    public static int getFixedInteger() {
        return 10;
    }

    public static int sum(int x, int y) {
        return x + y;
    }

    public static int difference(int x, int y) {
        return x - y;
    }
    public static int multiply(int x, int y) {
        return x * y;
    }

    public static int divide(int x, int y) {
        return x / y;
    }

    public static int modulo(int x, int y) {
        return x % y;
    }

    public static boolean isEven(int x) {
        return x % 2 == 0;
    }

    public static boolean isOdd(int x) {
        return x % 2 == 1;
    }

    public static boolean isGreaterThan(int x, int y) {
        return x > y;
    }

    public static boolean isLesserThan(int x, int y) {
        return x < y;
    }

    public static String getHelloWorld() {
        return "Hello World";
    }

    public static double getDoubleSum(double x, double y) {
        return x + y;
    }

    public static String combineInputWithSpace(String a, int b) {
        return a + " " + b;
    }
    public static int reverse3DigitsUsingArithmeticOperators(int x) {
        int first = ((int) x / 100);
        int second = ((int) x / 10);
        int third  = ((int) x % second);
        second = second - first * 10;
        return third * 100 + second * 10 + first;
    }

}
