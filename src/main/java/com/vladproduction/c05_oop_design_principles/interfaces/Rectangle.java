package com.vladproduction.c05_oop_design_principles.interfaces;

// Rectangle is a concrete class and is-a ShapeCommon; it can be rotated and hence implements Rotatable
public class Rectangle extends ShapeCommon implements Rotatable{

    private int length, height;

    public Rectangle(int length, int height) {
        this.length = length;
        this.height = height;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 10);
        rectangle.rotate(45);
        System.out.println("rectangle.area() = " + rectangle.area());
    }

    @Override
    public void rotate(float degree) {
        System.out.println("some implementation of rotate method; degree is: " + degree);
    }

    @Override
    double area() {
        return length * height;
    }
}
