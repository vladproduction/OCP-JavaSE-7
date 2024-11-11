package com.vladproduction.c02_pretest.cover_questions.task07;

public class Overloaded {
    public static void foo(Integer i) { System.out.println("foo(Integer)"); }
    public static void foo(short i) { System.out.println("foo(short)"); }
    public static void foo(long i) { System.out.println("foo(long)"); }
    public static void foo(int ... i) { System.out.println("foo(int ...)"); }
    public static void main(String []args) {
        foo(10);
    }
}

/*Which one of the following options correctly describes the output of this program?
a) foo(Integer)
b) foo(short)
+++c) foo(long)
d) foo(int ...)*/

