package com.vladproduction.c06_generics_and_collections.generics.object_vs_generics;

public class BoxPrinterGenericTest4 {
    public static void main(String[] args) {
        BoxPrinterGeneric<Integer> value1 = new BoxPrinterGeneric<Integer>(10);
        System.out.println(value1);
        Integer intValue1 = value1.getValue();
        BoxPrinterGeneric<String> value2 = new BoxPrinterGeneric<String>("Hello world");
        System.out.println(value2);
        // OOPs! by mistake, we did put String in an Integer
//        Integer intValue2 = value2.getValue();
    }
}
