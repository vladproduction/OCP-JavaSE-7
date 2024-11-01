package com.vladproduction.c11_exceptions_and_assertions.custom;

/**
 *  illustrating how to create your own exception classes, assume that you want to create a custom exception
 * named InvalidInputException. When you try to read input (read an integer, in this case), and if it fails, you want to
 * throw this InvalidInputException
 *
 * // a custom "unchecked exception" that is meant to be thrown
 * // when the input provided by the user is invalid
 * */
public class InvalidInputException extends RuntimeException {

    // 1- default constructor
    public InvalidInputException() {
        super();
    }

    // 2- constructor that takes the String detailed information we pass while raising an exception
    public InvalidInputException(String str) {
        super(str);
    }

    // 3- constructor that remembers the cause of the exception and throws the new exception
    public InvalidInputException(Throwable originalException) {
        super(originalException);
    }

    // 4- constructor
    // first argument takes detailed information string created while raising an exception
    // and the second argument is to remember the cause of the exception
    public InvalidInputException(String str, Throwable originalException) {
        super(str, originalException);
    }
}
