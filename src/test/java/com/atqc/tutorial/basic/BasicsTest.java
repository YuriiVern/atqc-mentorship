package com.atqc.tutorial.basic;


import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class BasicsTest {

    private final Basics basics = new Basics();

    @Test
    public void testReverseString() {
        String text = "qwerty";
        var reversedText = basics.reverse(text);
        assertEquals(reversedText, "ytrewq","Reverse method doesn't work correct");
    }

    @Test(priority = 1)
    public void testFindMinValue() {
        int[] array = {4, 3, 5, 1, 9, 2, 6, 1};
        var minValue = basics.findMinValue(array);
        assertEquals(minValue,1,"Find min value method doesn't work correct");
    }

    @Test(priority = 2)
    public void testFindMaxValue() {
        int[] array = {5, 3, 13, 18, 9, 21, 6, 5};
        var maxValue = basics.findMaxValue(array);
        assertEquals(maxValue,21,"Find max value method doesn't work correct");
    }

    @Test(priority = 3)
    public void testSortArray() {
        int[] array = {4, 3, 5, 1, 9, 2, 6, 1};
        var sortedArray = basics.sortedArray(array);
        assertEquals(sortedArray, new int[] {1, 1, 2, 3, 4, 5, 6, 9},"Sorted array method doesn't work properly");
    }

    @Test(priority = 4)
    public void testSkipArrayElement() {
        char[] array = {'a', 'p', 'e', 'n', 'p', 'w'};
        var  skippedArray= basics.skipArrayElement(array,'p');
        assertEquals(skippedArray, new char[] {'a', 'e', 'n', 'w'},"Skip element method doesn't work properly");
    }

}
