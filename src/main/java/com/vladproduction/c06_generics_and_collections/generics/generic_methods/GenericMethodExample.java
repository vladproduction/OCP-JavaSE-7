package com.vladproduction.c06_generics_and_collections.generics.generic_methods;

public class GenericMethodExample {
    public static void main(String[] args) {
        GenericMethodExample example = new GenericMethodExample();

        // Using the generic method with different types
        Integer[] intArray = {1, 2, 3};
        String[] strArray = {"Hello", "World"};

        System.out.println("Integer Array:");
        example.printArray(intArray); // Output: 1 2 3

        System.out.println("String Array:");
        example.printArray(strArray); // Output: Hello World
    }

    // Generic method that can accept any type
    public <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }

}
