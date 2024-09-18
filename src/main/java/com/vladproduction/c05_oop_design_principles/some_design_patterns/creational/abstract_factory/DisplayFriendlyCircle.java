package com.vladproduction.c05_oop_design_principles.some_design_patterns.creational.abstract_factory;

public class DisplayFriendlyCircle implements DisplayFriendlyShape{

    private int xPos, yPos, radius;

    public DisplayFriendlyCircle(int xPos, int yPos, int radius) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.radius = radius;
        System.out.println("DisplayFriendlyCircle constructor");
    }

    @Override
    public void draw() {
        System.out.println("DisplayFriendlyCircle draw()");
    }
}
