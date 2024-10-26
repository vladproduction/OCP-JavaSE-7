package com.vladproduction.c06_generics_and_collections.generics.upper_bounded_wildcard;

import java.util.ArrayList;
import java.util.List;

public class BoundedInMethodArg {
    public static void main(String[] args) {

        //list of double elements:
        List<Double> doubleList = new ArrayList<>(List.of(10.5, 20.5, 15.0));
        double sumDouble = sumElementsOfList(doubleList);
        System.out.println("sumDouble = " + sumDouble);

        //list of integer elements:
        List<Integer> integerList = new ArrayList<>(List.of(10, 21, 15));
        System.out.println("sumInteger = " + (int)sumElementsOfList(integerList));

        /*sumDouble = 46.0
        sumInteger = 46*/

    }

    private static double sumElementsOfList(List<? extends Number> list){
        double total = 0.0;
        for (Number number : list) {
            total += number.doubleValue();
        }
        return total;
    }

}
