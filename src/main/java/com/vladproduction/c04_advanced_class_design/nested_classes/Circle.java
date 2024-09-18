package com.vladproduction.c04_advanced_class_design.nested_classes;

public class Circle {
    public static void main(String[] args) {
        System.out.println(new Circle(10, 10, 20));
    }

    private Point center;
    private int radius;

    /*need to prefix the object reference of the outer class to create an instance of the inner class. In this case,
    it is a 'this' reference, so prefixing it with 'this' before the new operator*/
    public Circle(int x, int y, int radius) {
        center = this.new Point(x, y);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "mid point = " + center + " and radius = " + radius;
    }

    // define Point as an inner class within Circle class
    class Point{
        private int xPos, yPos;
        public Point(int xPos, int yPos) {
            this.xPos = xPos;
            this.yPos = yPos;
        }
        @Override
        public String toString() {
            return "[xPos=" + xPos + ", yPos=" + yPos +"]";
        }
    }
}
