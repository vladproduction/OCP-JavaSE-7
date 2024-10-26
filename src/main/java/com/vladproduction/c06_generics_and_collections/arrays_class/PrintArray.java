package com.vladproduction.c06_generics_and_collections.arrays_class;

import java.util.Arrays;

public class PrintArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println("Array contain: " + arr); //Array contain: [I@119d7047
        System.out.println("Array contain: " + Arrays.toString(arr)); //Array contain: [1, 2, 3, 4, 5]
    }
}
