package com.vladproduction.c06_generics_and_collections.generics.multiple_bound;

public class MainBoundedClass {
    public static void main(String[] args) {

        MultipleBound<A> obj= new MultipleBound<>(new A());
        obj.run();

    }
}
