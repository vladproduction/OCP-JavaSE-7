package com.vladproduction.c05_oop_design_principles.some_design_patterns.behavioral.observer;

import java.util.Observable;

public class Circle extends Observable {
    private Point center;
    private int radius;

    public Circle(int x, int y, int r) {
        center = new Point(x, y);
        radius = r;
    }
    public void setCenter(Point center) {
        this.center = center;
        setChanged();
        notifyObservers();
    }

    public void setRadius(int radius) {
        this.radius = radius;
        setChanged();
        notifyObservers();
    }

    public String toString() {
        return "center = " + center + " and radius = " + radius;
    }

}
