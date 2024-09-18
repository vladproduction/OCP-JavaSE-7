package com.vladproduction.c03_java_class_design.essentials_OOP;

public class Dynamic_toString {
    public static void main(String[] args) {


        System.out.println(new PointClass(10, 10));
        //after overridden toString():x = 10, y = 10

        //or we can take as base class Object.class
        //and derived class is still PointClass:
        Object objPoint = new PointClass(20,20);
        System.out.println(objPoint);


    }
}

class PointClass {
    private int xPoint, yPoint;

    public PointClass(int xPoint, int yPoint) {
        this.xPoint = xPoint;
        this.yPoint = yPoint;
    }

    @Override
    public String toString() {
        return "x = " + xPoint + ", y = " + yPoint;
    }
}
