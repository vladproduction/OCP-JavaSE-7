package com.vladproduction.c06_generics_and_collections.generics.object_vs_generics;

public class BoxPrinterGenericTest3 {
    public static void main(String[] args) {
        BoxPrinterGeneric<Integer> value1 = new BoxPrinterGeneric<Integer>(10);
        System.out.println(value1);
        BoxPrinterGeneric<String> value2 = new BoxPrinterGeneric<String>("Hello world");
        System.out.println(value2);
    }
}
