package com.vladproduction.c05_oop_design_principles.some_design_patterns.creational.abstract_factory;

public class PrinterFriendlyCircle implements PrinterFriendlyShape{
    private int xPos, yPos, radius;

    public PrinterFriendlyCircle(int xPos, int yPos, int radius) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.radius = radius;
        System.out.println("PrinterFriendlyCircle constructor");
    }

    @Override
    public void draw() {
        System.out.println("PrinterFriendlyCircle draw()");
    }
}
