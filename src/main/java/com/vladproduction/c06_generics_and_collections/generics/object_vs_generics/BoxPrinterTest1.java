package com.vladproduction.c06_generics_and_collections.generics.object_vs_generics;

public class BoxPrinterTest1 {
    public static void main(String []args) {
        BoxPrinter value1 = new BoxPrinter(10);
        System.out.println(value1);
        BoxPrinter value2 = new BoxPrinter("Hello world");
        System.out.println(value2);
    }
}
