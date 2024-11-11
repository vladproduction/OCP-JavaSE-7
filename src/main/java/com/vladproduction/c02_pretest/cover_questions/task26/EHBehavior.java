package com.vladproduction.c02_pretest.cover_questions.task26;

public class EHBehavior {
    public static void main(String[] args) {
        try {
            int i = 10 / 0; // LINE A
            System.out.print("after throw -> ");
        } catch (ArithmeticException ae) {
            System.out.print("in catch -> ");
            return;
        } finally {
            System.out.print("in finally -> ");
        }
        System.out.print("after everything");
    }
}
/*Which one of the following options best describes the behavior of this program?
a) The program prints the following: in catch -> in finally -> after everything.
b) The program prints the following: after throw -> in catch -> in finally -> after everything.
c) The program prints the following: in catch -> in finally -> after everything.
d) The program prints the following: in catch -> after everything.
+++e) The program prints the following: in catch -> in finally ->.
f) When compiled, the program results in a compiler error in line marked with comment in LINE A for divide-by-zero.*/
