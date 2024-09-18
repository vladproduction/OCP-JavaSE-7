package com.vladproduction.c05_oop_design_principles.object_composition;

//Point is an independent class and here we are using it with Circle2 class
public class Point {

    private int xPos;
    private int yPos;
    public Point(int x, int y) {
        xPos = x;
        yPos = y;
    }

    public String toString() {
        return "(" + xPos + "," + yPos + ")";
    }

}
