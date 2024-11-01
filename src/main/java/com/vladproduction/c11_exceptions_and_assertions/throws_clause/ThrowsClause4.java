package com.vladproduction.c11_exceptions_and_assertions.throws_clause;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * overriding the base method, the derived method should also adhere to that contract
 * */
public class ThrowsClause4 implements IntReader{
    // implement readIntFromFile with the same throws clause
    // or a more general throws clause
    public int readIntFromFile() throws FileNotFoundException { //extending from IOException so it is not problem
        Scanner consoleScanner = new Scanner(new File("integer.txt"));
        return consoleScanner.nextInt();
    }
    // main method elided in this code since the focus here is to understand
    // issues related to overriding when throws clause is present


    /*Unchecked exceptions can still be added or
    removed from the contract when compared to the base class method’s throws clause.
    For example:*/
    public int readIntFromFile2() throws IOException, NoSuchElementException {
        Scanner consoleScanner = new Scanner(new File("integer.txt"));
        return consoleScanner.nextInt();
    }
    /*This is an acceptable throws clause since NoSuchElementException can get thrown from the readIntFromFile()
    method. This exception is an unchecked exception, and it gets thrown when the nextInt() method could not read
    an integer from the file. This is a common situation, for example, if you have an empty file named integer.txt; an
    attempt to read an integer from this file will result in this exception.*/
}
