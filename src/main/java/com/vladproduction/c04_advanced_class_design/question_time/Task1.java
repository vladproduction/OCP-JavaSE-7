package com.vladproduction.c04_advanced_class_design.question_time;

public class Task1 {
    public static void main(String[] args) {
        /*create instantiate of a concrete subclass of an abstract class but cannot
                create instance of an abstract class itself.*/
        A a = new B();
    }
}

abstract class A {

}

class B extends A {

}

//public abstract final class Shape { } //couldn`t to define as abstract and final
