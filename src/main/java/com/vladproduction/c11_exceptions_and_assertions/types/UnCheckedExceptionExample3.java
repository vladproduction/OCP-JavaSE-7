package com.vladproduction.c11_exceptions_and_assertions.types;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * fixed example of: UnCheckedExceptionExample2
 * solution:
 *      It is a good practice to perform defensive checks and avoid raising unnecessary runtime exceptions;
 * */
public class UnCheckedExceptionExample3 {
    public static void main(String[] args) throws FileNotFoundException {
        // if any argument is passed, it would be greater than or equal to one
        if(args.length >= 1){
            FileInputStream fis = new FileInputStream(args[0]);
        }else {
            System.out.println("Error: No arguments passed in the commandline!");
            System.out.println("Pass the name of the file to open as commandline argument");
        }
    }
}
