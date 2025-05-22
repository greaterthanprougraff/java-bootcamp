package org.accenture.day02.worksheet;

public class Day02Worksheet {

    // Return true if both numbers are positive
    public static boolean bothPositive(int x, int y) {
        return x > 0 && y > 0;
    }

    // Return true if exactly one number is positive
    public static boolean onlyOnePositive(int x, int y) {
        return (x > 0 && y <= 0) || (x <= 0 && y > 0);
    }

    // Return true if person is eligible to vote
    public static boolean canVote(boolean isCitizen, int age) {
        return isCitizen && age >= 18;
    }

    // Return true if year is a leap year (divisible by 4, not 100 unless also 400)
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Return grade letter based on score
    public static String gradeLetter(int score) {
        if (score >= 90) return "A";
        else if (score >= 80) return "B";
        else if (score >= 70) return "C";
        else if (score >= 60) return "D";
        else return "F";
    }

    // Return "positive", "negative", or "zero"
    public static String numberSign(int x) {
        if (x > 0) return "positive";
        else if (x < 0) return "negative";
        else return "zero";
    }

    // Return true if number is between 10 and 20 (inclusive)
    public static boolean isBetween10And20(int x) {
        return x >= 10 && x <= 20;
    }

    // Return true if number is divisible by 3 or 5
    public static boolean isMultipleOfThreeOrFive(int x) {
        return x % 3 == 0 || x % 5 == 0;
    }

    // Return "Fizz" if divisible by 3, "Buzz" if divisible by 5, "FizzBuzz" if both, else number as string
    public static String fizzBuzz(int x) {
        if (x % 3 == 0 && x % 5 == 0) return "FizzBuzz";
        else if (x % 3 == 0) return "Fizz";
        else if (x % 5 == 0) return "Buzz";
        else return Integer.toString(x);
    }

    // Return true if sum of x and y is even
    public static boolean isSumEven(int x, int y) {
        return (x + y) % 2 == 0;
    }

    // Return the larger of two numbers
    public static int max(int x, int y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
        
    }

    // Return the smaller of two numbers
    public static int min(int x, int y) {
        if (x < y) {
            return x;
        } else {
            return y;
        }
        
    }
}
