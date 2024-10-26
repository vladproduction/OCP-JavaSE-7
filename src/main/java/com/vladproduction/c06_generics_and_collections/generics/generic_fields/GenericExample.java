package com.vladproduction.c06_generics_and_collections.generics.generic_fields;

/**
 * Non-Static Field instanceField: In the class GenericExample, you can declare a non-static field instanceField of type T.
 * This is perfectly valid. Every instance of GenericExample will have its own instanceField.
 *
 * Static Field staticField: If you attempt to declare a static field of type T (as shown in the commented line),
 * it will result in a compilation error.
 * The reason is that static fields do not correspond to a specific instance
 * but rather to the class itself, which doesn't have a specific T.
 * */
public class GenericExample <T>{

    // Non-static field of type T
    T instanceField; // This is allowed

    // Static field of type T - This will cause a compilation error
    // static T staticField; // Uncommenting this line will cause a compilation error

    // Constructor to initialize the instance field
    public GenericExample(T value) {
        this.instanceField = value;
    }

    // Method to display the value of the instance field
    public void display() {
        System.out.println("Instance Field: " + instanceField);
    }

}
