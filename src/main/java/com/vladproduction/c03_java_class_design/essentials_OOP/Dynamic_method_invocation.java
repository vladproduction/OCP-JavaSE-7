package com.vladproduction.c03_java_class_design.essentials_OOP;


/**
 * area() method is called based on the dynamic type of the Shape
 * */
public class Dynamic_method_invocation {
    public static void main(String[] args) {

        //runtime polymorphism

        //shape as a circle:
        ShapeClass circle = new CircleClass(10);
        System.out.println(circle.area());

        //shape as a square:
        ShapeClass square = new SquareClass(10);
        System.out.println(square.area());

    }


}

class ShapeClass {
    public double area() {
        System.out.println("Shape");
        return 0; } // default implementation (base class)
    // other members
}

class CircleClass extends ShapeClass {
    private int radius;
    public CircleClass(int r) { radius = r; }
    // other constructors
    public double area() {
        System.out.println("Circle");
        return Math.PI * radius * radius; } //(subclass)
    // other declarations
}

class SquareClass extends ShapeClass {
    private int side;
    public SquareClass(int a) { side = a; }
    public double area() {
        System.out.println("Square");

        return side * side; }//(subclass)
    // other declarations
}
