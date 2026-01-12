package com.atqc.tutorial.basic;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;
import java.util.Scanner;


public class BasicsTest {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
//variables

        byte num1 = 100;
        System.out.println("variable:" + num1);
        short num2 = -23000;
        System.out.println("variable:" + num2);
        long num3 = 500000;
        System.out.println("variable:" + num3);
        float num4 = 5.505f;
        System.out.println("variable:" + num4);
        double num6 = 5.5050505f;
        System.out.println("variable:" + num6);
        char sym = '*';
        System.out.println(sym);
        String word = " ";
        System.out.println(word);
        boolean isHappy = false;
        System.out.println(isHappy);
    }

//variable no value
        /*
        int A;
        System.out.println(A);
    } */

//comparing
   /*     float f1 = 0.5f;
        float f2 = 0.7f;
        float f3 = 1.0f;
        float f4 = 0.1f;

        double d1 = 0.5;
        double d2 = 0.7;
        double d3 = 1.0;
        double d4 = 0.1;

        System.out.println("f1 == d1:" + (f1 == d1));
        System.out.println("f2 == d2:" + (f2 == d2));
        System.out.println("f3 == d3:" + (f3 == d3));
        System.out.println("f4 == d4:" + (f4 == d4));
        System.out.println("divide:" + d1/0);
        System.out.println("divide:" + f1/0);

        int i = 500;
        long l = i;
        System.out.println("int to long:" + l);
    } */
//wrappers
   /*    String intValue1 = "123";
        int number1 = Integer.parseInt(intValue1);
        System.out.println(number1);


        String doubleValue2 = "2.23";
        double number2 = Double.parseDouble(doubleValue2);
        System.out.println(number2);

        int i = 1;
        double d = 1.2;
        boolean b = true;
        String s1 = String.valueOf(i);
        String d1 = String.valueOf(d);
        String b1 = String.valueOf(b);
        System.out.println(s1);
        System.out.println(d1);
        System.out.println(b1);
*/
//operators
 /*       int a = 4;
        int b = 2;
        int oper = a % b;
        System.out.println("10 % 3 = " + oper);

        int x = 20;
        x += 5;
        System.out.println(x);
        x -= 10;
        System.out.println(x);
        x *= 2;
        System.out.println(x);
        x /= 3;
        System.out.println(x);
        x %= 4;
        System.out.println(x);
    } */
//conditions
/*        boolean t = true;
        boolean f = false;
        System.out.println("true && false = " + (t && f));
        System.out.println("false || true = " + (f || t));
        System.out.println("!true = " + (!t));

    } */
//difference
/*        for (float j = 100f; j > 0.5f; j /= 2) {
            System.out.println("Element is " + j);
        }
        for (int w = 100; w <= 110; w++) {
            System.out.println("w is " + w);
        }
        for (int t = 0; t <= 20; t = t + 2) {
            System.out.println("t is " + t);
        }
        int k = 10;
        while (k >= 1) {
            System.out.println("Element is " + k);
            k -= 1;
        }
    } */
//conditions
    /*    System.out.println("enter:");
        int person = scan.nextInt();
        char sym = 't';
        if (person == 5 && sym == 't') {
            System.out.println("user:");
            boolean isNew = false;
            if (!isNew)
                System.out.println("bool is false");
        } else if (person > 60)
            System.out.println("number is > 60:");
        else
            System.out.println("number is undefined");
    } */

    /*    Scanner scan = new Scanner(System.in);
        System.out.println("enter 1 number:");
        double a = scan.nextInt();
        System.out.println("enter 2 number:");
        double b = scan.nextInt();
        System.out.println("enter 3 number:");
        int c = scan.nextInt();
        System.out.println("enter math sym:");
        scan.nextLine();
        char math = scan.nextLine().charAt(0);
        double res = 0;
        switch (math) {
            case '+':
                res = a + b;
                System.out.println("res" + res);
                break;
            case '-':
                res = a - b;
                System.out.println("res" + res);
                break;
            case '/':
                if (b == 0) System.out.println("error");
                else {
                    res = a / b;
                    System.out.println("res" + res);
                }
                break;
        }
    } */
//loops
    /*    int A = 100;
        while (A <= 110) {
            System.out.println("number" + A);
            A++;
        }
          int B = 0;
        do {
            System.out.println("element is" + B);
            B++;
        } while (B < 10);
    } */

    /*    do {
            System.out.println("infinite");
        }
        while (true);
    } */
    /*    for (int i = 1; i <= 5; i++) {
            if (i == 2) {
                continue;
            }
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }
        for (int I = 1; I <= 5; I++) {
            if (I == 2) {
                continue;
            }
            if (I == 4) {
                return;
            }
            System.out.println("I =" + I);
        }
    } */
//concatenate
 /*     String word1 = "Hey";
        String word2 = "Boy";
        String res = word1 + " " + word2;
        System.out.println(res);
    } */

 /*     String text = "      egweerw  ererferw  kuy  yu i      ";
        System.out.println("orig length:" + text.length());

        String trimmedText = text.trim();
        System.out.println("Trimmed string: " + trimmedText + " ");
        System.out.println("Trimmed length: " + trimmedText.length());

        String [] words = trimmedText.split("\\s+");
        System.out.println("Split values:");
        for (String word : words) {
            System.out.println(word);
        }

        String textWithE = "   egweerw  ererferw  kuy  yu i ";
        String replacedText = textWithE.replace('e', 'E');
        System.out.println("Replaced 'e' -> 'E': " + replacedText);

        String priceText = "this item previous price $5.99, Sale price $1.99.";
        String[] prices = priceText.split("\\$");
        double originalPrice = Double.parseDouble(prices[1].split(",")[0]);
        double salePrice = Double.parseDouble(prices[2].replace(".", ""));
        System.out.println("\nParsed prices:");
        System.out.println("Original price: $" + originalPrice);
        System.out.println("Sale price: $" + salePrice);
    } */


}













