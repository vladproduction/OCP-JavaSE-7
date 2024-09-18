package com.vladproduction.c04_advanced_class_design.abstract_classes;

/**
 * abstract classes are the best place to put a common functionality
 * */
public abstract class ShapeAbstract {
    public double area_not_good_solution() { return 0; } // default implementation
    // other members
    public abstract double area(); // note: no implementation (i.e., no method body definition)

    //do some for useful staff:
    private ShapeAbstract parentShape;
    public void setParentShape(ShapeAbstract shape){
        parentShape = shape;
    }
    public ShapeAbstract getParentShape(){
        return parentShape;
    }
}
