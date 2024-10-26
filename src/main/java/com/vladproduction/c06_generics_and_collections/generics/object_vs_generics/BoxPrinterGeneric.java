package com.vladproduction.c06_generics_and_collections.generics.object_vs_generics;

public class BoxPrinterGeneric<T> {

    private T val;
    public BoxPrinterGeneric(T arg) {
        val = arg;
    }

    public T getValue() {
        return val;
    }

    public String toString() {
        return "[" + val + "]";
    }

}
