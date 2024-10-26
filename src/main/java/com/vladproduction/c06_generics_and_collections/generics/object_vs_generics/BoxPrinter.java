package com.vladproduction.c06_generics_and_collections.generics.object_vs_generics;

public class BoxPrinter {
    private Object val;

    public BoxPrinter(Object arg) {
        val = arg;
    }

    public Object getValue() {
        return val;
    }

    public String toString() {
        return "[" + val + "]";
    }
}
