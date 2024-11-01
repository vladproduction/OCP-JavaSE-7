package com.vladproduction.c11_exceptions_and_assertions.custom;

import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * // class for testing the custom exception InvalidInputException
 * */
public class CustomExceptionTest {
    public static void main(String[] args) {
        System.out.println("Type an integer in the console: ");
        try {
            System.out.println("You typed the integer value: " + readIntFromConsole());
        } catch(InvalidInputException iie) {
            System.out.println("Error: Invalid input in console... ");
            System.out.println("The current caught exception is of type: " + iie);
            System.out.println("The originally caught exception is of type: " +
                    iie.getCause());
        }

        /*Since the cause of InvalidInputException is InputMismatchException, this exception name is printed in the
        console as a fully qualified name, java.util.InputMismatchException. You can think of InputMismatchException
        causing InvalidInputException; these two exceptions are known as chained exceptions.*/

    }

    public static int readIntFromConsole() {
        Scanner consoleScanner = new Scanner(System.in);
        int typedInt = 0;
        try {
            typedInt = consoleScanner.nextInt();
        } catch(NoSuchElementException nsee) {
            System.out.println("Wrapping up the exception and throwing it...");
            throw new InvalidInputException("Invalid integer input typed in console", nsee);
        } catch(Exception e) {
            // call all other exceptions here ...
            System.out.println("Error: Encountered an exception and could not read an integer from the console... ");
        }
        return typedInt;
    }

}
