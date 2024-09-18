package com.vladproduction.c04_advanced_class_design.abstract_classes;

public class RectangleClass extends ShapeAbstract{
    private int length, height;

    //need  to declare the derived class (RectangleClass) abstract or provide a definition of the area() method
    //we decide to provide method
    public double area() { return length * height; }
    // other members ...

}
