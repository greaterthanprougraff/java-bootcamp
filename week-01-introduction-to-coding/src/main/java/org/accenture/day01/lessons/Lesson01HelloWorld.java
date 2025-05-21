package org.accenture.day01.lessons;

// A main class
public class Lesson01HelloWorld {
    /*
     * A special method signature that tells the JVM where to start the application.
     * Breakdown of 'public static void main(String[] args)':
     *
     * public     - Access modifier: means it can be called from outside the class
     * static     - Belongs to the class, not to instances (JVM can call it without creating an object)
     * void       - Return type: means this method does not return any value
     * main       - The name the JVM looks for as the entry point of the program
     * String[] args - An array of strings used to receive command-line arguments
     */
    public static void main(String[] args) {
        /*
         * System
         *   - A built-in Java class (utility class, non-instantiable on purpose)
         *   - Provides access to system-level features like printing messages and getting time
         *
         * out
         *   - A static PrintStream object inside the System class
         *
         * println
         *   - A method of the PrintStream class that prints the input to the console
         */
        System.out.println("Hello, world!");

        //TODO: Use addFiveToNumber method from Lesson02Methods class and print it
        Lesson02Methods lesson02 = new Lesson02Methods();
        System.out.println(lesson02.addFiveToNumber(4));

        //TODO: Use the method that returns two integers from Lesson02Methods and print it
        System.out.println(lesson02.sumOfTwoNumbers(1,2));
        //TODO: Invoke printInstanceVariables() method from Lesson03VariablesAndDataTypes
        Lesson03VariablesAndDataTypes lesson03 = new Lesson03VariablesAndDataTypes();
        lesson03.printInstanceVariables();
        lesson03.playAroundWithVariablesAndDataTypes();
        //TODO: Try to change the values here for HELLO_WORLD and FINAL_HELLO_WORLD variables that belongs in Lesson03VariablesAndDataTypes
        Lesson03VariablesAndDataTypes.HELLO_WORLD = "Hello world";
        System.out.println(Lesson03VariablesAndDataTypes.HELLO_WORLD);
    }
}
