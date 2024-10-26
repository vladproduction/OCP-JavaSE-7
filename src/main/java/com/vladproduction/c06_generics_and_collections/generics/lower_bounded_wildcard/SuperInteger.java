package com.vladproduction.c06_generics_and_collections.generics.lower_bounded_wildcard;

import java.util.ArrayList;
import java.util.List;

/**
 * example that demonstrates how to use the method myFunction that accepts a list with a lower bound List<? super Integer>;
 * can pass a list of Integer or any super class (like Number or Object) to the method;
 * So the above function accepts List<Integer> & List<Number> but NOT List<Double>;
 * */
public class SuperInteger {
    public static void main(String[] args) {

        // Creating a List<Integer>
        List<Integer> integerList = new ArrayList<>();
        System.out.println("List<Integer>:");
        addingElementsToTheList(integerList);
        // Output: List contents: [10, 20, 30]

        // Creating a List<Number>
        List<Number> numberList = new ArrayList<>();
        System.out.println("List<Number>:");
        addingElementsToTheList(numberList);
        // Output: List contents: [10, 20, 30]

        // Creating a List<Object>
        List<Object> objectList = new ArrayList<>();
        System.out.println("List<Object>:");
        addingElementsToTheList(objectList);
        // Output: List contents: [10, 20, 30]

    }

    // Method that accepts a list of Integer or any super class of Integer
    public static void addingElementsToTheList(List<? super Integer> list) {
        // Adding some Integer values to the list
        list.add(10);
        list.add(20);
        list.add(30);

        // Displaying the contents of the list
        System.out.println("List contents: " + list);
    }

}
