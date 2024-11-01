package com.vladproduction.c11_exceptions_and_assertions.question_time.quest2;

public class ChainedException {
    public static void foo() {
        try {
            throw new ArrayIndexOutOfBoundsException();
        } catch(ArrayIndexOutOfBoundsException oob) {
            RuntimeException re = new RuntimeException(oob);
            re.initCause(oob);
            throw re;
        }
    }
    public static void main(String []args) {
        try {
            foo();
        } catch(Exception re) {
            System.out.println(re.getClass());
        }
    }

    /*When executed, this program prints which of the following?
    A. class java.lang.RuntimeException
    B. class java.lang.IllegalStateException
    C. class java.lang.Exception
    D. class java.lang.ArrayIndexOutOfBoundsException

    Answer: B. class java.lang.IllegalStateException
    (In the expression new RuntimeException(oob);, the exception object oob is already chained
    to the RuntimeException object. The method initCause() cannot be called on an exception
    object that already has an exception object chained during the constructor call. Hence, the call
    re.initCause(oob); results in initCause() throwing an IllegalStateException.)*/

}
