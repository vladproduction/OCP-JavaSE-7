package com.vladproduction.c05_oop_design_principles.some_design_patterns.observer;

/**
 * a loosely coupled implementation;
 * subject—Circle class—does not know about the
 * concrete observer classes, and the observers do not know about the concrete subject
 * */
public class TestMain {
    public static void main(String[] args) {
        Circle circle = new Circle(10, 10, 20);
        System.out.println(circle);
        circle.addObserver(new Canvas());
        circle.addObserver(new ShapeArchiver());
        circle.setRadius(50);
        System.out.println(circle);
    }
}
