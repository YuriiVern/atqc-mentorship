package com.atqc.tutorial.basic;

import org.testng.annotations.Test;

public class BasicsTest {

    @Test
    public void checkPrimitiveTypes() {

        //#1 Check point

        long longValue = 123456123l;
        int intValue = 12345;
        byte byteValue = 1;
        short shortValue = 123;
        double doubleValue = 1234.123456;
        float floatValue = 123.456f;
        char charValue = 'a';
        String stringValue = "TEST Test test";
        boolean boolValue = false;

        String[] stringArray = {"First", "Second", "Third", "Forth"};
        int[] intArray = {1, 3, 5, 8};
        boolean[] boolArray = {false, true, true, false};

        double[] doubleArray = {0.5, 0.7, 1.0, 0.1};
        float[] floatArray = {0.5f, 0.7f, 1.0f, 0.1f};

        //#2 check point
        int a;
        //System.out.println(a);
        //Commented due to error during execution

        //#3 check point
        float f1 = 0.5f;
        float f2 = 0.7f;
        float f3 = 1.0f;
        float f4 = 0.1f;

        double d1 = 0.5;
        double d2 = 0.7;
        double d3 = 1.0;
        double d4 = 0.1;

        System.out.println(f1 == d1);
        System.out.println(f2 == d2);
        System.out.println(f3 == d3);
        System.out.println(f4 == d4);


        //Deviding variable by zero
        int valueForDevidingByZero = 100;
        //int resultOfDevidingByZero = 100/0;
        //System.out.println(resultOfDevidingByZero);
        //Commented due to error during execution

        //Assign int to long and long to int
        intValue = 100;
        longValue = 1000000000l;
        //int intValueAssignLong = longValue;
        long longValueAssignInt = intValue;

        System.out.println(longValueAssignInt);


        //#4 check point
        // Integer wrapper / parser
        int intValueForParser = Integer.parseInt("999");
        System.out.println(intValueForParser);

        //Double wrapper / parser
        double doubleValueForParser = Double.parseDouble("999.99");
        System.out.println(doubleValueForParser);

        //String wrapper / parser
        String intToStringValue = String.valueOf(123);
        String doubleToStringValue = String.valueOf(123.45);
        String floatToString = String.valueOf(123.45f);
        String longToString = String.valueOf(1234567890123456789l);

        System.out.println(intToStringValue);
        System.out.println(doubleToStringValue);
        System.out.println(floatToString);
        System.out.println(longToString);




        //#5 check point
        a = 5;
        int b = 2;

        //modulus / remainder
        int remainder = a % b;
        System.out.println(remainder);

        //add and assign
        a += 1;
        System.out.println(a);

        //subtract and assign
        a -= 1;
        System.out.println(a);

        //multiply and assign
        a *= 2;
        System.out.println(a);

        //devide and assign
        a /= 2;
        System.out.println(a);

        //modulus and assign
        a %= 2;
        System.out.println(a);

        //increment
        System.out.println(++a);

        //decrement
        System.out.println(--a);


    }

    @Test
    public void checkConditions() {

        //#1 Check point
        boolean valueTrue = true;
        boolean valueFalse = false;

        boolean resultOfComparation;
        resultOfComparation = valueTrue && valueFalse;
        System.out.println(resultOfComparation);
        System.out.println(!resultOfComparation);

        resultOfComparation = valueTrue || valueFalse;
        System.out.println(resultOfComparation);
        System.out.println(!resultOfComparation);

        //#2 Check point
        int intValue2_2_1 = 10;
        int intValue2_2_2 = 15;

        System.out.println(intValue2_2_1 < 15);
        System.out.println(intValue2_2_1 < 10);
        System.out.println(intValue2_2_1 <= 15);
        System.out.println(intValue2_2_1 <= 10);
        System.out.println(intValue2_2_1 == 10);
        System.out.println(intValue2_2_1 == 15);
        System.out.println(intValue2_2_1 != 10);
        System.out.println(intValue2_2_1 != 15);
        System.out.println(intValue2_2_1 >= 5);
        System.out.println(intValue2_2_1 >= 10);
        System.out.println(intValue2_2_1 > 5);
        System.out.println(intValue2_2_1 > 10);
        System.out.println(intValue2_2_1 < intValue2_2_2);
        System.out.println(intValue2_2_1 > intValue2_2_2);

        //#3 Check point
        int intValue2_3_1 = 10;
        int intValue2_3_2 = 15;

        //if, else

        if (intValue2_3_1 == intValue2_3_2) {
            System.out.println("value 1 and value 2 are equeal");
        } else {
            System.out.println("value 1 and value 2 are not equeal");
        }

        // if, if else, else
        if (intValue2_3_1 == intValue2_3_2) {
            System.out.println("value 1 and value 2 are equeal");
        } else if (intValue2_3_1 > intValue2_3_2) {
            System.out.println("value 1 greater than value 2");
        } else {
            System.out.println("value 1 less than value 2");
        }

        //Ternary operator

        String resultOfVarComparation = (intValue2_3_1 >= intValue2_3_2) ? "value 1 equal or greater than value 2" : "value 1 less than value 2";
        System.out.println(resultOfVarComparation);

        //#4 Check point
        int season = 3;

        switch (season) {
            case 1:
                System.out.println("Winter");
                break;
            case 2:
                System.out.println("Spring");
                break;
            case 3:
                System.out.println("Summer");
                break;
            case 4:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Invalid season");
        }
    }

        @Test
        public void checkLoops() {

            //#1 Check point: Cycles while
            int i = 0;
            while (i < 10) {
                System.out.println(i);
                i++;
            }

            //#1 Check point:  Cycles do-while

            i = 0;
            do {
                System.out.println(i);
                i++;
            } while (i < 10);


            //#1-#2 Check point:  Cycles loop
            for (int j = 0; j < 3; j++) {
                System.out.println(j);
            }

            //#1 Check point:  Cycles for
            int[] arr = {4, 5, 6};
            for (int x : arr) {
                System.out.println(x);
            }

            //#3 Check point:  Infinitive cycles
            /*i = 0;
            while (i >= 0) {
                System.out.println(i);
                i++;
            }

            i = 0;
            do {
                System.out.println(i);
                i++;
            } while (i >= 0);

            for (int j = 0; j >= 0; j++) {
                System.out.println(j);
            }
            */


            //#4 Check point: Loops flow control
            for (i = 1; i <= 5; i++) {
                if (i == 3) {
                    break;
                }
                System.out.println(i);
            }

            for (i = 1; i <= 5; i++) {
                if (i == 3) {
                    continue;
                }
                System.out.println(i);
            }

            for ( i = 1; i <= 5; i++) {
                if (i == 3) {
                    //return;
                }
                System.out.println(i);
            }
            System.out.println("End of method");

    }

    @Test
    public void checkString() {

        //#1 Check point

        String str1 = "Start of string";
        String str2 = " end of string";

        System.out.println(str1 + str2);
        System.out.println("Text:" + str1 + str2);
        System.out.println("Hello".concat(" World"));
        System.out.println("string"+ 1);

        //#2 Check point

        String randomString = "      egweerw  ererferw  kuy  yu i      ";
        System.out.println(randomString.length());
        System.out.println(randomString.trim());
        System.out.println(randomString.trim().length());

        String[] words = randomString.trim().split(" ");

        for (String word : words) {
            System.out.println(word);
        }

        String modifiedRandomString = randomString.replace('e', 'E');
        System.out.println(modifiedRandomString);

        String stringToParse =  "this item previous price $5.99, Sale price $1.99.";

        int firstDollar = stringToParse.indexOf('$');
        int comma = stringToParse.indexOf(',');

        int secondDollar = stringToParse.lastIndexOf('$');
        int dot = stringToParse.lastIndexOf('.');

        String oldPrice = stringToParse.substring(firstDollar + 1, comma);
        String newPrice = stringToParse.substring(secondDollar + 1, dot);

        System.out.println("Old price: " + oldPrice + " New price: " + newPrice);

    }
}