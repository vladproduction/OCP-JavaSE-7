package com.vladproduction.c11_exceptions_and_assertions.intro;

/**
 * Exception(Throwable cause)
 * Exception(string detailMsg, throwable cause)
 * Similar constructors are available for other classes such as Throwable, Error, and RuntimeException. The following
 * program illustrates chained exceptions:
 * */
public class ChainedException {
    public static void foo() {
        try {
            String [] str = { "foo" };
            System.out.println("About to throw ArrayIndexOutOfBoundsException");
            // following statement has out-of-bounds access
            String functionName = str[10];
        } catch(ArrayIndexOutOfBoundsException oob) {
            System.out.println("Wrapping ArrayIndexOutOfBoundsException into a RuntimeException");
            throw new RuntimeException(oob);
        }
    }
    public static void main(String []args) {
        try {
            foo();
        } catch(Exception re) {
            System.out.println("The caught exception in main is: " + re.getClass());
            System.out.println("The cause of the exception is: " + re.getCause());
        }
    }

    //output:
    /*About to throw ArrayIndexOutOfBoundsException
    Wrapping ArrayIndexOutOfBoundsException into a RuntimeException
    The caught exception in main is: class java.lang.RuntimeException
    The cause of the exception is: java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 1*/
}
