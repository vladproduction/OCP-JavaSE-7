package com.vladproduction.c06_generics_and_collections.arrays_class;

import java.util.Arrays;

/**
 * always call binarySearch() on a sorted array/container. otherwise - unpredictable results;
 * */
public class BinarySearchTest {
    public static void main(String []args) {
        failed();
        System.out.println("-----------");
        improved();
    }

    private static void improved() {
        String [] strArr = { "21", "22", "11", "12", "13" };
        System.out.println("The given strArr is: " + Arrays.toString(strArr));
        Arrays.sort(strArr);
        System.out.println("strArr after sorting is: " + Arrays.toString(strArr));
        int index = Arrays.binarySearch(strArr, "22");
        System.out.println("The index value is: " + index);
    }

    private static void failed() {
        String[] strArr = {"21", "22", "11", "12", "13"};
        System.out.println("The given strArr is: " + Arrays.toString(strArr));
        int index = Arrays.binarySearch(strArr, "22");
        System.out.println("The index value is: " + index);
    }
}
