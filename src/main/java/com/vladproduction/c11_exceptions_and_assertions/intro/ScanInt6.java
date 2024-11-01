package com.vladproduction.c11_exceptions_and_assertions.intro;

import java.util.Scanner;

/**
 * close scanner when not exception is occurred
 * */
public class ScanInt6 {
    public static void main(String [] args) {
        System.out.println("Type an integer in the console: ");
        Scanner consoleScanner = new Scanner(System.in);
        try {
            System.out.println("You typed the integer value: " +
                    consoleScanner.nextInt());
            System.out.println("Done reading the text... closing the Scanner");
            consoleScanner.close();
        } catch(Exception e) {
            // call all other exceptions here ...
            System.out.println("Error: Encountered an exception and could not read an integer from the console... ");
            System.out.println("Exiting the program - restart and try the program again!");
        }
    }
}
