package com.vladproduction.c11_exceptions_and_assertions.question_time.quest3;

public class ExceptionTest {
    public static void foo() {
        try {
            throw new ArrayIndexOutOfBoundsException();
        } catch(ArrayIndexOutOfBoundsException oob) {
//            throw new Exception(oob);
        }
    }
    public static void main(String []args) {
        try {
            foo();
        } catch(Exception re) {
            System.out.println(re.getCause());
        }
    }

    /*Which one of the following options correctly describes the behavior of this program?
    A. java.lang.Exception
    B. java.lang.ArrayIndexOutOfBoundsException
    C. class java.lang.IllegalStateException
    D. This program fails with compiler error(s)

    Answer: D. This program fails with compiler error(s)

    (The foo() method catches ArrayIndexOutOfBoundsException and chains it to an Exception
    object. However, since Exception is a checked exception, it must be declared in the throws
    clause of foo(). Hence this program results in this compiler error:*/
}
