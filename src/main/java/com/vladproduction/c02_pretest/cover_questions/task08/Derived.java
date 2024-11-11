package com.vladproduction.c02_pretest.cover_questions.task08;

public class Derived extends Base {
    public static void foo(Base bObj) {
        System.out.println("In Derived.foo()");
        bObj.bar();
    }
    public void bar() {
        System.out.println("In Derived.bar()");
    }
}
