package com.vladproduction.c05_oop_design_principles.some_design_patterns.abstract_factory;

public class DisplayFriendlyFactory implements ShapeFactory{

    @Override
    public Shape getShape(String shape) {
        switch(shape){
            case "Circle":
                return new DisplayFriendlyCircle(10, 10, 20);
            case "Rectangle":
                return new DisplayFriendlyRectangle(10, 20);
        }
        return null;
    }
}
