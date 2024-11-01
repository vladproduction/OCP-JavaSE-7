package com.vladproduction.c11_exceptions_and_assertions.multiple_catch_block;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * multiple catch block:
 * A program that scans an integer from a given string;
 * input is: String integerStr = ""; (empty), so we can catch exception;
 * */
public class ScanInt4 {
    public static void main(String [] args) {
        String integerStr = "";
        System.out.println("The string to scan integer from it is: " + integerStr);
        Scanner consoleScanner = new Scanner(integerStr);
        try {
            System.out.println("The integer value scanned from string is: " +
                    consoleScanner.nextInt());
        } catch(InputMismatchException ime) {
            System.out.println("Error: Cannot scan an integer from the given string");
        } catch(NoSuchElementException nsee) {
            System.out.println("Error: Cannot scan an integer from the given string");
        } catch(IllegalStateException ise) {
            System.out.println("Error: nextInt() called on a closed Scanner object");
        }
    }
    //output:
    /*The string to scan integer from it is:
    Error: Cannot scan an integer from the given string*/

    /*When providing multiple catch handlers, handle specific exceptions before handling general exceptions.
    If you provide a derived class exception catch handler after a base class exception handler, your code will not compile.*/

}
