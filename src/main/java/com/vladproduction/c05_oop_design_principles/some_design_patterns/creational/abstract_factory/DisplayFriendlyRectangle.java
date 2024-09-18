package com.vladproduction.c05_oop_design_principles.some_design_patterns.creational.abstract_factory;

public class DisplayFriendlyRectangle implements DisplayFriendlyShape{

    private int sideA, sideB;

    public DisplayFriendlyRectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
        System.out.println("DisplayFriendlyRectangle constructor");
    }

    @Override
    public void draw() {
        System.out.println("DisplayFriendlyRectangle draw()");
    }
}
