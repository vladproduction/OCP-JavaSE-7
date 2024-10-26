package com.vladproduction.c06_generics_and_collections.generics.wildcard;

import java.util.ArrayList;
import java.util.List;

public class Limitations_of_Wildcards {
    public static void main(String[] args) {
        // List with an unknown type using a wildcard
        List<?> listOfWildCards = new ArrayList<>();
        // Attempting to add an element to a wildcard list is not allowed
        // because the type is unknown, leading to type safety issues.
        // listOfWildCards.add(10); // This line would cause a compile error.

        System.out.println(listOfWildCards);

        // List explicitly defined to hold Integer types
        List<Integer> listOfWildCards2 = new ArrayList<>();
        listOfWildCards2.add(10); // Valid because listOfWildCards2 is declared as List<Integer>

        System.out.println(listOfWildCards2);
    }
}
