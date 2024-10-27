package com.vladproduction.c07_string_processing.processing.parsing;

public class StringConversions {
    public static void main(String[] args) {

        String str1 = String.valueOf(10); // right way to convert from an integer to String
        System.out.println("str1 = " + str1);

        int i = Integer.parseInt("10"); // right way to convert from a String to an int
        System.out.println("i = " + i);

        /*This parseInt() method is an overloaded method. There is another parseInt() method that takes an additional
        argument: the base (or radix) of the integral value such as octal and hexadecimal.
        The wrapper classes Byte, Short, Long, Float, and Double have the equivalent parse methods
        to convert a string to the corresponding primitive type value.*/
    }
}
