package com.vladproduction.c07_string_processing.processing.searching;

/**
 * This method checks if the string starts with the specified prefix starting from the given offset.
 * */
public class PrefixExample1 {
    public static void main(String[] args) {
        String str = "Hello, World!";

        // Check if it starts with "Hello" from the beginning (offset 0)
        boolean result1 = str.startsWith("Hello", 0);
        System.out.println("Starts with 'Hello' at offset 0: " + result1); // true

        // Check if it starts with "World" from index 7
        boolean result2 = str.startsWith("World", 7);
        System.out.println("Starts with 'World' at offset 7: " + result2); // true

        // Check if it starts with "Hello" from index 5
        boolean result3 = str.startsWith("Hello", 5);
        System.out.println("Starts with 'Hello' at offset 5: " + result3); // false
    }
}
