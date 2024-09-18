package com.vladproduction.c03_java_class_design.essentials_OOP.deep_override;

public class Point {
    private int xPos, yPos;

    public Point(int x, int y) {
        xPos = x;
        yPos = y;
    }
    // override the equals method to perform
    /*The dynamic type of these three variables is Point, so it should call the overridden equals()
    method. However, the overriding is wrong, so the main() method calls the base version, which is the default
    implementation of Point in Object class!*/
    // "deep" comparison of two Point objects
    /*public boolean equals(Point other){
        if(other == null)
            return false;
        // two points are equal only if their x and y positions are equal
        if( (xPos == other.xPos) && (yPos == other.yPos) )
            return true;
        else
            return false;
    }*/
    //still not correct method equals():
    /*The method equals(Point) of type Point must override or
    implement a supertype method*/
    //Here is the code with @Override annotation for the equals method:
    /*@Override
    public boolean equals(Point other) {
        if(other == null)
            return false;
        // two points are equal only if their x and y positions are equal
        if( (xPos == other.xPos) && (yPos == other.yPos) )
            return true;
        else
            return false;
    }*/

    //correct overridden equals():
    /*The equals() method should have Object as the argument instead of the Point argument! The current
    implementation of the equals() method in the Point class hides (not overrides) the equals() method of the
    Object class.*/
    // pass the Object type to the argument of the equals method
    // override the equals method to perform "deep" comparison of two Point objects
    @Override
    public boolean equals(Object other) {
        if (other == null)
            return false;

        // check if the dynamic type of 'other' is Point
        // if 'other' is of any other type than 'Point', the two objects cannot be
        // equal if 'other' is of type Point (or one of its derived classes), then
        // downcast the object to Point type and then compare members for equality
        if (other instanceof Point) {
            Point anotherPoint = (Point) other;
            // two points are equal only if their x and y positions are equal
            if ((xPos == anotherPoint.xPos) && (yPos == anotherPoint.yPos))
                return true;
        }
        return false;
    }


    public static void main(String[] args) {
        //case#1:
        Point p1 = new Point(10, 20);
        Point p2 = new Point(50, 100);
        Point p3 = new Point(10, 20);
        System.out.println("p1 equals p2 is " + p1.equals(p2));
        System.out.println("p1 equals p3 is " + p1.equals(p3));
        //output:
        /*p1 equals p2 is false
        p1 equals p3 is true*/

        //case#2:
        Object p11 = new Point(10, 20);
        Object p12 = new Point(50, 100);
        Object p13 = new Point(10, 20);
        System.out.println("p11 equals p12 is " + p11.equals(p12));
        System.out.println("p11 equals p13 is " + p11.equals(p13));
        //output:
        /*p11 equals p12 is false
        p11 equals p13 is false*/

        //after correct overridden equals():
        //for executing case#2 we got correct output:
        /*p11 equals p12 is false
        p11 equals p13 is true*/

    }


}
