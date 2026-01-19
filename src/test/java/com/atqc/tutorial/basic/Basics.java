package com.atqc.tutorial.basic;

    public class Basics {


        public String reverse(String text) {
            String reversedText = "";

            for (int i = text.length() - 1; i >= 0; i--) {
                reversedText += text.charAt(i);
            }
            return reversedText;
        }

        public int findMinValue(int[] array) {

            int min = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] < min) {
                    min = array[i];
                }
            }
            return min;
        }

        public int findMaxValue(int[] array) {

            int max = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
            }
            return max;
        }

        public int[] sortedArray(int[] array){

            for (int i = 0; i < array.length - 1; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] > array[j]) {
                        int a = array[i];
                        array[i] = array[j];
                        array[j] = a;
                    }
                }
            }
            return array;

        }

        public char[] skipArrayElement(char[] array, char skipElement){
            int count = 0;
            for (char c : array) {
                if (c != skipElement) {
                    count++;
                }
            }

            char[] result = new char[count];


            for (int i = 0, j = 0; i < array.length; i++) {
                if(array[i] != skipElement){
                    result[j++] = array[i];
                }
            }
            return result;

        }
    }
