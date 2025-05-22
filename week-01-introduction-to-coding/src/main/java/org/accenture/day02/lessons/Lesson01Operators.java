package org.accenture.day02.lessons;

// We will use this as the main class
public class Lesson01Operators {

    // Declaring instance variables (objects)
    private Lesson01Operators lesson01Operators;
    public static void main(String[] args) {
        //Reviewing operators from Day01
        //TODO Sum of two variables
        int b = 1;
        int c = 2;
        int sum = b + c;
        System.out.println(sum);

        //TODO Get the remainder when you divide 12 by 10 and store to variable named 'remainder'
        int remainder = 12 % 10;
        System.out.println(remainder);
        //TODO Increase the value of a using '++' until it equals 5
        int a = 1;
        while (a != 5) {
            a++;
        }
        System.out.println(a);
    }
}
