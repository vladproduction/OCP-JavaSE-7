package com.vladproduction.c05_oop_design_principles.some_design_patterns.factory;

public class ShapeFactory {

    public static IShape getShape(String shape){
        switch (shape){
            case "CircleObj": return new CircleObj(10,10,10);
            case "RectObj": return new RectObj(10,10);
        }
        return null;
    }

}
