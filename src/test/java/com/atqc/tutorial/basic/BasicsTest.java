package com.atqc.tutorial.basic;

import org.testng.annotations.Test;

public class BasicsTest {

    @Test
    public void checkPrimitiveTypes() {

        //#1 heck point

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
}