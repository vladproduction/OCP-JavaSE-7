package com.vladproduction.c05_oop_design_principles.some_design_patterns.creational.abstract_factory;

public class PrinterFriendlyFactory implements ShapeFactory{

    @Override
    public Shape getShape(String shape) {
        switch(shape) {
            case "Circle":
                return new PrinterFriendlyCircle(10, 10, 20);
            case "Rectangle":
                return new PrinterFriendlyRectangle(10, 20);
        }
        return null;
    }
}
