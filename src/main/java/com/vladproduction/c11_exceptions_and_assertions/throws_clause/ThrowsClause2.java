package com.vladproduction.c11_exceptions_and_assertions.throws_clause;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ThrowsClause2 {
    public static void main(String []args) throws FileNotFoundException {
        System.out.println("Reading an integer from the file 'integer.txt': ");
        Scanner consoleScanner = new Scanner(new File("integer.txt"));// were added throws clause to the method signature
        System.out.println("You typed the integer value: " + consoleScanner.nextInt());
    }
}
