package com.atqc.tutorial.basic;

public class Basics {

    /**
     * Reverses the given string.
     *
     * @param text input string
     * @return reversed string
     *
     * Example:
     * reverse("qwerty") → "ytrewq"
     */
    public String reverse(String text) {
        return new StringBuilder(text)
                .reverse()
                .toString();
    }



    /**
     * Finds the minimum value in the array.
     *
     * @param array array of integers
     * @return minimum value from the array
     *
     * Example:
     * findMinValue([4,3,5,1]) → 1
     */
    public int findMinValue(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    /**
     * Finds the maximum value in the array.
     *
     * @param array array of integers
     * @return maximum value from the array
     *
     * Example:
     * findMaxValue([5,3,21,6]) → 21
     */
    public int findMaxValue(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    /**
     * Sorts the array in ascending order.
     *
     * @param array input array
     * @return new sorted array
     *
     * Example:
     * sortedArray([4,3,5,1]) → [1,3,4,5]
     */
    public int[] sortedArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }


    /**
     * Removes all occurrences of the given character from the array.
     *
     * @param array input character array
     * @param elementToSkip character to remove
     * @return array without skipped character
     *
     * Example:
     * skipArrayElement(['a','p','e'], 'p') → ['a','e']
     */
    public char[] skipArrayElement(char[] array, char elementToSkip) {
        int skippedArraySize = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != elementToSkip) {
                skippedArraySize++;
            }
        }

        char[] skippedArray = new char[skippedArraySize];
        int currentIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != elementToSkip) {
                skippedArray[currentIndex++] = array[i];
            }

        }
        return skippedArray;
    }

}
