package com.vladproduction.c05_oop_design_principles.interfaces;

// Circle is a concrete class that is-a subtype of ShapeCommon; you can scroll it and hence implements Scrollable interface

public class Circle extends ShapeCommon implements Scrollable{

    private int xPos, yPos, radius;

    public Circle(int xPos, int yPos, int radius) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.radius = radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(10,10,10);
        circle.scroll(45);
        System.out.println("circle.area() = " + circle.area());
    }

    @Override
    public void scroll(float degree) {
        System.out.println("some implementation of scroll method; degree is: " + degree);
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}
