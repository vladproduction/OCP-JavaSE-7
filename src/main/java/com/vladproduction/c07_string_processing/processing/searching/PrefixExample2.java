package com.vladproduction.c07_string_processing.processing.searching;

/**
 * This method checks if the string starts with the specified prefix from the beginning of the string.
 * */
public class PrefixExample2 {
    public static void main(String[] args) {
        String str = "Hello, World!";

        // Check if it starts with "Hello"
        boolean result1 = str.startsWith("Hello");
        System.out.println("Starts with 'Hello': " + result1); // true

        // Check if it starts with "World"
        boolean result2 = str.startsWith("World");
        System.out.println("Starts with 'World': " + result2); // false
    }
}
