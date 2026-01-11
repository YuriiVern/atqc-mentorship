package com.atqc.tutorial.basic;

import org.testng.annotations.Test;

public class VariablesTaskTest {
    @Test
    public void experimentWithVariables() {
        // --- TASK 2: Create variables of different types ---

        // 1. Whole numbers (integers)
        byte myByte = 100;           // Very small number (-128 to 127)
        short myShort = 30000;       // Small number
        int myInt = 1000000;         // Standard number (most common)
        long myLong = 9000000000L;   // Huge number (Note the 'L' at the end!)

        // 2. Decimal numbers (floating point)
        float myFloat = 5.5f;        // Less precise (Note the 'f' at the end)
        double myDouble = 99.99;     // More precise (Standard for decimals)

        // 3. Characters and Boolean
        char myChar = 'A';           // Single character (Uses single quotes '')
        boolean myBoolean = true;    // True or false only

        // 4. Strings (Text)
        String myString = "Hello Mentorship"; // Text (Use double quotes "")

        // Array of Integers
        int[] numbersArray = {1, 2, 3, 4, 5};

        // Array of Strings
        String[] wordsArray = {"Java", "is", "cool"};

        // Array of Booleans
        boolean[] flagsArray = {true, false, true};

        // Two Dimensional Array (An array of arrays)
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };

        // --- TASK 3: Try to assign weird values (Uncomment to see errors) ---

        // ERROR: Byte can only hold up to 127.
        // byte hugeByte = 12321423123;
        // EXPLANATION: IntelliJ underlines this in RED.
        // This is a "Compilation Error". The number is too big for the 'byte' box.

        // ERROR: Int too big
        // int hugeInt = 9999999999999999999999;
        // EXPLANATION: 'int' has a limit (approx 2 billion).
        // For numbers this big, you must use 'long' or specific Objects.

        // --- TASK 4: Type Mismatches (Uncomment to see errors) ---

        // 1. Assigning String to Int
        //int age = "Twenty";
        // EXPLANATION: Error "Incompatible types".
        // You cannot put text into a number box.

        // 2. Assigning Int to String
        // String name = 500;
        // EXPLANATION: Error. A String expects quotes "".
        // Correct way: String name = "500";

        // 3. Number to Char
        char letter = 65;
        System.out.println("The char 65 is: " + letter);
        // EXPLANATION: This works, but it doesn't print 65. It prints 'A',
        // because computers store letters as ASCII numbers. 65 = 'A'.

        // --- Printing results to console ---
        System.out.println("Byte value: " + myByte);
        System.out.println("Long value: " + myLong);
        System.out.println("String value: " + myString);
        System.out.println("First element of array: " + wordsArray[0]);
        System.out.println("Matrix value: " + matrix);
    }
}
