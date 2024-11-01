package com.vladproduction.c11_exceptions_and_assertions.multiple_catch_block;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * code provides a catch handler for the base exception to the type Exception;
 * so,  provide a general exception handler to ensure that all other exceptions are handled as well;
 * */
public class ScanInt3_with_general {
    public static void main(String[] args) {
        String integerStr = "100";
        System.out.println("The string to scan integer from it is: " + integerStr);
        Scanner consoleScanner = new Scanner(integerStr);
        try {
            System.out.println("You typed the integer value: " + consoleScanner.nextInt());
        } catch(InputMismatchException ime) {
            // if something other than integer is typed, we'll get this exception, so handle it
            System.out.println("Error: You typed some text that is not an integer value...");
        } catch(Exception e) {
            // catch IllegalStateException here which is unlikely to occur...
            System.out.println("Error: Encountered an exception and could not read an integer from the console... ");
        }
    }
}
