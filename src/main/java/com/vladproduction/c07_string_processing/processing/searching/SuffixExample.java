package com.vladproduction.c07_string_processing.processing.searching;

/**
 * This method checks if the string ends with the specified suffix.
 * */
public class SuffixExample {
    public static void main(String[] args) {
        String str = "Hello, World!";

        // Check if it ends with "World!"
        boolean result1 = str.endsWith("World!");
        System.out.println("Ends with 'World!': " + result1); // true

        // Check if it ends with "Hello"
        boolean result2 = str.endsWith("Hello");
        System.out.println("Ends with 'Hello': " + result2); // false

        // Check if it ends with "!"
        boolean result3 = str.endsWith("!");
        System.out.println("Ends with '!': " + result3); // true
    }
}
