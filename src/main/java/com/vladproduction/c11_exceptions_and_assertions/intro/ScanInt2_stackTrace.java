package com.vladproduction.c11_exceptions_and_assertions.intro;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * handle exception:
 * try and catch keywords to handle any exceptions that can get thrown in the code;
 * A simple program to accept an integer from user in normal case,
 * otherwise prints an error message;
 * All exceptions have a method named getStackTrace() that returns an array of StackTraceElements;
 * */
public class ScanInt2_stackTrace {
    public static void main(String[] args) {
        System.out.println("Type an integer in the console: ");
        Scanner consoleScanner = new Scanner(System.in);
        try {
            System.out.println("You typed the integer value: " + consoleScanner.nextInt());
        } catch(InputMismatchException ime) {
            // nextInt() throws InputMismatchException in case anything other than an integer
            // is typed in the console; so handle it
            System.out.println("Error: You typed some text that is not an integer value...");
            ime.printStackTrace();
            System.out.println("The calls in the stack trace are: ");
            // access each element in the "call stack" and print them individually
            for(StackTraceElement methodCall : ime.getStackTrace())
                System.out.println(methodCall);
        }

    }
}
