package com.vladproduction.c06_generics_and_collections.generics.object_vs_generics;

public class BoxPrinterTest2 {
    public static void main(String[] args) {
        BoxPrinter value1 = new BoxPrinter(10);
        System.out.println(value1);
        Integer intValue1 = (Integer) value1.getValue();
        BoxPrinter value2 = new BoxPrinter("Hello world");
        System.out.println(value2);
        // OOPs! by mistake, we did (Integer) cast instead of (String)
//        Integer intValue2 = (Integer) value2.getValue();
    }
}
