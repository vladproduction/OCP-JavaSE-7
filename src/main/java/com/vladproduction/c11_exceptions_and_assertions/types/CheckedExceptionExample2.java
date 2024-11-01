package com.vladproduction.c11_exceptions_and_assertions.types;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionExample2 {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(args[0]); //'somefile.txt' assume does not exist
    }
}
