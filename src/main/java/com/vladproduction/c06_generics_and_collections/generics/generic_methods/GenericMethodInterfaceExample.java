package com.vladproduction.c06_generics_and_collections.generics.generic_methods;

public class GenericMethodInterfaceExample {
    public static void main(String[] args) {
        Printer printer = new ConsolePrinter();

        // Using the generic method with different types
        printer.print(123);          // Output: 123
        printer.print("Hello!");     // Output: Hello!
        printer.print(45.67);        // Output: 45.67
    }

}

// Non-generic interface
interface Printer {
    // Generic method in a non-generic interface
    <T> void print(T item);
}

// Class implementing the Printer interface
class ConsolePrinter implements Printer {
    @Override
    public <T> void print(T item) {
        System.out.println(item);
    }
}
