package com.vladproduction.c11_exceptions_and_assertions.types;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * catching a runtime exception such as ArrayIndexOutOfBoundsException is a bad practice!
 * it is indicating likely programming errors, and you should fix the code instead of
 * catching and handling the exceptions
 * */
public class UnCheckedExceptionExample2 {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            FileInputStream fis = new FileInputStream(args[0]);
        } catch (ArrayIndexOutOfBoundsException aioobe) {
            System.out.println("Error: No arguments passed in the commandline!");
            System.out.println("Pass the name of the file to open as commandline argument");
        }
    }
}
