package com.vladproduction.c06_generics_and_collections.generics.generic_classes;

public class Pair<T1, T2> {
    T1 obj1;
    T2 obj2;

    public Pair(T1 obj1, T2 obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public T1 getFirst(){
        return obj1;
    }

    public T2 getSecond(){
        return obj2;
    }
}
