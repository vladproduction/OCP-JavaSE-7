package com.vladproduction.c05_oop_design_principles.some_design_patterns.observer;

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
