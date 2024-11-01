package com.vladproduction.c11_exceptions_and_assertions.types;

/**
 * Error;
 * Consider a programming example to understand how an error could occur. Assume that you’re writing
 * a recursive method to calculate the factorial of a number and forget to put in the right termination condition;
 * example to get: StackOverflowError
 * */
public class NonTerminatingRecursion {
    // factorial is a recursive call
    static int factorial(int n) {
        int result = 0;
        // Assume that the following termination condition statement is missing ...
        //comment if statement will produce StackOverFlowException
         if(n == 0) return 1;
        result = factorial(n - 1) * n;
        return result;
    }
    public static void main(String ... args) {
        System.out.println("factorial of 4 is: " + factorial(4));
    }
    /*Exceptions of type Error indicate an abnormal condition in the program. There is no point in catching this
    exception and trying to continue execution and pretending nothing has happened. It is a really bad
    practice to do so!*/
}
