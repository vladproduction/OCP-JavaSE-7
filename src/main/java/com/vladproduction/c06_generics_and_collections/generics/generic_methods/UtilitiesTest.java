package com.vladproduction.c06_generics_and_collections.generics.generic_methods;

import java.util.ArrayList;
import java.util.List;

public class UtilitiesTest {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(10);
        intList.add(20);
        System.out.println("The original list is: " + intList);
//        Utilities.fill1(intList, 100);
        Utilities.fill2(intList, 100);
        System.out.println("The list after calling Utilities.fill() is: " + intList);
    }
}
