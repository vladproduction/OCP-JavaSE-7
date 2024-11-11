package com.vladproduction.c02_pretest.cover_questions.task25;

public class EHTest {
    public static void main(String[] args) {
        try {
            BaseClass base = new DeriDeriClass();
            base.foo();
        } catch (RuntimeException e) {
            System.out.println(e);
        }
    }
}
/*Which one of the following options correctly describes the behavior of this program?
        +++a) The program prints the following: InvalidKeyException.
        b) The program prints the following: RuntimeException.
        c) The program prints the following: IllegalArgumentException.
        d) The program prints the following: InvalidValueException.
        e) When compiled, the program will result in a compiler error in line marked with comment Line A due to missing
            throws clause.*/
