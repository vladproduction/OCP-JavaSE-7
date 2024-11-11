package com.vladproduction.c02_pretest.cover_questions.task08;

public class Base {
    public static void foo(Base bObj) {
        System.out.println("In Base.foo()");
        bObj.bar();
    }
    public void bar() {
        System.out.println("In Base.bar()");
    }
}
