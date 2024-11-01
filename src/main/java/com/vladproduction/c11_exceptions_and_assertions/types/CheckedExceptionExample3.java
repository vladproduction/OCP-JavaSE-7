package com.vladproduction.c11_exceptions_and_assertions.types;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * limerick.txt were pass as args[0] to program;
 * if no file we got exception;
 * */
public class CheckedExceptionExample3 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream(args[0]);
        } catch(FileNotFoundException fnfe) {
            System.out.println("Error: There is no file that exists with name "
                    + args[0]);
            System.out.println("Pass a valid file name as commandline argument!");
        }
    }
    /*If you have some code that can throw a checked exception from a method, you can choose between the
    two alternatives. You can either handle that exception by providing a catch block or declare that method
    to throw that exception. If you don’t catch or declare the method to throw that exception, your code
    won’t compile.*/
}
