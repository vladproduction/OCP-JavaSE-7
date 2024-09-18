package com.vladproduction.c03_java_class_design.essentials_OOP;

public class Circle {

    int xPos, yPos, radius;

    /*//default constructor:
    public Circle() {
        xPos = 20; // assume some default values for xPos and yPos
        yPos = 20;
        radius = 10; // default radius
    }
    //overloaded constructor:
    // the x, and y positions need to be set in that case, but a default radius value can be assumed
    public Circle(int x, int y) {
        xPos = x;
        yPos = y;
        radius = 10; // default radius
    }
    //using 'this' in another overloaded constructor (added one more param - radius):
    public Circle(int xPos, int yPos, int radius) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.radius = radius; // not default radius here
    }*/

    //shorter example by invoking one constructor from another ('this' keyword):
    public Circle(int x, int y, int r) {
        xPos = x;
        yPos = y;
        radius = r;
    }
    public Circle(int x, int y) {
        this(x, y, 10); // passing default radius 10
    }
    public Circle() {
        this(20, 20, 10);
        // assume some default values for xPos, yPos and radius
    }

    //override toString():
    @Override
    public String toString() {
        return "center = (" + xPos + "," + yPos + ") and radius = " + radius;
    }

    //entry point of Program:
    public static void main(String[] args) {

        System.out.println(new Circle());
        System.out.println(new Circle(10, 10));
        System.out.println(new Circle(10, 10, 5));
    }
}
