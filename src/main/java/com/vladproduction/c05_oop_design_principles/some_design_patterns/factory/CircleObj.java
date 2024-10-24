package com.vladproduction.c05_oop_design_principles.some_design_patterns.factory;

public class CircleObj implements IShape{

    private int xPos, yPos, radius;

    public CircleObj(int xPos, int yPos, int radius) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.radius = radius;
        System.out.println("CircleObj constructor");
    }

    @Override
    public void draw() {
        System.out.println("CircleObj draw()");
    }

    @Override
    public void fillColor() {
        System.out.println("CircleObj fillColor()");
    }
}
