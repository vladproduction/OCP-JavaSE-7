package com.vladproduction.c05_oop_design_principles.object_composition;

// Circle2 "contains" a Point object
public class Circle2 {
    private Point center; //instead of using xPos and yPos
    private int radius;

    public Circle2(int x, int y, int radius) {
        this.center = new Point(x, y);
        this.radius = radius;
    }

    public String toString() {
        return "center = " + center + " and radius = " + radius;
    }

    public static void main(String[] args) {
        System.out.println(new Circle2(10, 10, 20));
    }
}
