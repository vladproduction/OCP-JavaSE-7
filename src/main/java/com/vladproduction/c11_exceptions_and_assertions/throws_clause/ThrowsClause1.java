package com.vladproduction.c11_exceptions_and_assertions.throws_clause;

import java.io.File;
import java.util.Scanner;

public class ThrowsClause1 {
    public static void main(String []args) {
        System.out.println("Reading an integer from the file 'integer.txt': ");
//        Scanner consoleScanner = new Scanner(new File("integer.txt"));// need to add throws clause to the method signature
//        System.out.println("You typed the integer value: " + consoleScanner.nextInt());
    }
}
