package com.vladproduction.c11_exceptions_and_assertions.intro;

import java.util.Scanner;

/**
 * unhandled exception:
 * A simple program to accept an integer from user;
 * */
public class ScanInt {
    public static void main(String [] args) {
        System.out.println("Type an integer in the console: ");
        Scanner consoleScanner = new Scanner(System.in);
        System.out.println("You typed the integer value: " + consoleScanner.nextInt());
        //in case not integer...
        //The program will terminate after throwing an exception like this:
        //InputMismatchException – if the next token does not match the Integer regular expression;
    }
}
