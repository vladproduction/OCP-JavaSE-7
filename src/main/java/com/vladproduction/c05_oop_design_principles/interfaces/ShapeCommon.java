package com.vladproduction.c05_oop_design_principles.interfaces;


// Shape is the base class for all shape objects; shape objects that are associated with
// a parent shape object is remembered in the parentShape field
public abstract class ShapeCommon {

    abstract double area();
    private ShapeCommon parentShape;

    public ShapeCommon getParentShape() {
        return parentShape;
    }

    public void setParentShape(ShapeCommon shape) {
        parentShape = shape;
    }
}
