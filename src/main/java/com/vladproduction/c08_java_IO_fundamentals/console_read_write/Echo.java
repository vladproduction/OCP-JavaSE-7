package com.vladproduction.c08_java_IO_fundamentals.console_read_write;

import java.io.Console;

public class Echo {
    public static void main(String []args) {
        // get the System console object
        Console console = System.console();
        if(console == null) {
            System.err.println("Cannot retrive console object - are you running your" +
                    "application from an IDE? Exiting the application ... ");
            System.exit(-1); // terminate the application
        }
        // read a line and print it through printf
        console.printf(console.readLine());
    }
}
