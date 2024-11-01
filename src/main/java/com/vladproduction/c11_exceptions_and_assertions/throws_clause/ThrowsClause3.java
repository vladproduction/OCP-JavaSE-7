package com.vladproduction.c11_exceptions_and_assertions.throws_clause;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ThrowsClause3 {

    // since readIntFromFile() throws FileNotFoundException and main() does not handle
    // it, the main() method declares this exception in its throws cause
    public static void main(String []args) throws FileNotFoundException {
        System.out.println("Reading an integer from the file 'integer.txt': ");
        System.out.println("You typed the integer value: " +
                new ThrowsClause3().readIntFromFile());
    }

    // since this method does not handle FileNotFoundException,
    // the method must declare this exception in the throws clause
    public int readIntFromFile() throws FileNotFoundException {
        Scanner consoleScanner = new Scanner(new File("integer.txt"));
        return consoleScanner.nextInt();
    }
}
