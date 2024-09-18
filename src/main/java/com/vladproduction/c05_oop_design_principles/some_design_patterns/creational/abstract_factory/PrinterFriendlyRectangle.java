package com.vladproduction.c05_oop_design_principles.some_design_patterns.creational.abstract_factory;

public class PrinterFriendlyRectangle implements PrinterFriendlyShape{

    private int sideA, sideB;

    public PrinterFriendlyRectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
        System.out.println("PrinterFriendlyRectangle constructor");
    }

    @Override
    public void draw() {
        System.out.println("PrinterFriendlyRectangle draw()");
    }
}
