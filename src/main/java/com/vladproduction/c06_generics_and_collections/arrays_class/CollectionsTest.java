package com.vladproduction.c06_generics_and_collections.arrays_class;

import java.util.Arrays;

public class CollectionsTest {
    public static void main(String[] args) {

        //e String's compareTo() method does lexicographic comparison—the
        //string contents are compared character-by-character
        String[] strArr = {"21", "1", "111", "12", "123"};
        Arrays.sort(strArr);
        System.out.println(Arrays.toString(strArr));

        //for numbers, you need to compare values: 1, 12, 21, and so on with integers.
        int[] intArr = {21, 1, 111, 12, 123};
        Arrays.sort(intArr);
        System.out.println(Arrays.toString(intArr));

    }
}
