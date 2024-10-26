package com.vladproduction.c06_generics_and_collections.generics.generic_fields;

public class Main {
    public static void main(String[] args) {
        // Creating an instance of GenericExample with Integer type
        GenericExample<Integer> example1 = new GenericExample<>(10);
        example1.display(); // Output: Instance Field: 10

        // Creating an instance of GenericExample with String type
        GenericExample<String> example2 = new GenericExample<>("Hello");
        example2.display(); // Output: Instance Field: Hello
    }
}
