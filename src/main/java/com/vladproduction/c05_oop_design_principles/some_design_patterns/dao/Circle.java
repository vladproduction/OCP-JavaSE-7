package com.vladproduction.c05_oop_design_principles.some_design_patterns.dao;

public class Circle {

    private int xPos, yPos;
    private int radius;
    public Circle(int x, int y, int r) {
        xPos = x;
        yPos = y;
        radius = r;
    }

    public String toString() {
        return "center = (" + xPos + "," + yPos + ") and radius = " + radius;
    }

    public CircleTransfer getCircleTransferObject() {
        CircleTransfer circleTransfer = new CircleTransfer();
        circleTransfer.setRadius(radius);
        circleTransfer.setxPos(xPos);
        circleTransfer.setyPos(yPos);
        return circleTransfer;
    }
    // other members

}
