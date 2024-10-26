package com.vladproduction.c06_generics_and_collections.arrays_class;

import java.util.Arrays;
import java.util.List;

/**
 * cannot add elements to the List returned by the Arrays.asList() method;
 * we can modify the List and the modifications made in List are reflected in the original array;
 * */
public class ArrayAsListReflected {
    public static void main(String[] args) {

        Double[] temperatureArray = {31.1, 30.0, 32.5, 34.9, 33.7, 27.8};
        System.out.println("The original array is: " + Arrays.toString(temperatureArray));
        List<Double> temperatureList = Arrays.asList(temperatureArray);
        temperatureList.set(0, 35.2);
        System.out.println("The modified array is: " + Arrays.toString(temperatureArray));

        /*The original array is: [31.1, 30.0, 32.5, 34.9, 33.7, 27.8]
        The modified array is: [35.2, 30.0, 32.5, 34.9, 33.7, 27.8]*/

    }
}
