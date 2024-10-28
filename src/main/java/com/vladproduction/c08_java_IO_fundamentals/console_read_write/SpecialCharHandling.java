package com.vladproduction.c08_java_IO_fundamentals.console_read_write;

import java.io.Console;

/**
 * better to print thro' Console object - it handles "special characters" better
 * */
public class SpecialCharHandling {
    public static void main(String []args) {
        // string has three Scandinavian characters
        String scandString = "å, ä, and ö";
        // try printing scandinavian characters directly with println
        System.out.println("Printing scands directly with println: " + scandString);
        // now, get the Console object and print scand characters thro' that
        Console console = System.console();
        console.printf("Printing scands thro' console's printf method: " + scandString);
    }
}
