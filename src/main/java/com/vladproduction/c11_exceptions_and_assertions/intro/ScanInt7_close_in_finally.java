package com.vladproduction.c11_exceptions_and_assertions.intro;

import java.util.Scanner;

/**
 * release resources in a finally block;
 * */
public class ScanInt7_close_in_finally {
    public static void main(String [] args) {
        System.out.println("Type an integer in the console: ");
        Scanner consoleScanner = new Scanner(System.in);
        try {
            System.out.println("You typed the integer value: " +
                    consoleScanner.nextInt());
        } catch(Exception e) {
            // call all other exceptions here ...
            System.out.println("Error: Encountered an exception and could not read an integer from the console... ");
            System.out.println("Exiting the program - restart and try the program again!");
        } finally {
            System.out.println("Done reading the integer... closing the Scanner");
            consoleScanner.close();
        }
    }

    /*if you call System.exit() inside a method, it will abnormally terminate the program. so, if the calling
    method has a finally block, it will not be called and resources may leak. For this reason, it is a bad
    programming practice to call System.exit() to terminate a program.*/
}
