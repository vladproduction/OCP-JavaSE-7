package com.vladproduction.c11_exceptions_and_assertions.try_with_resources;

import java.util.Scanner;

public class TryWithResources2 {
    public static void main(String [] args) {
        System.out.println("Type an integer in the console: ");
        try(Scanner consoleScanner = new Scanner(System.in)) {
            System.out.println("You typed the integer value: " + consoleScanner.nextInt());
        }
    }
}
