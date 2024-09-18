package com.vladproduction.c05_oop_design_principles.some_design_patterns.creational.factory;

public class RectObj implements IShape{

    private int length, height;

    public RectObj(int length, int height) {
        this.length = length;
        this.height = height;
        System.out.println("RectObj constructor");
    }

    @Override
    public void draw() {
        System.out.println("RectObj draw()");
    }

    @Override
    public void fillColor() {
        System.out.println("RectObj fillColor()");
    }
}
