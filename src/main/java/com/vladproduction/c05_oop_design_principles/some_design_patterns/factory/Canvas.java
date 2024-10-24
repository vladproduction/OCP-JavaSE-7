package com.vladproduction.c05_oop_design_principles.some_design_patterns.factory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Canvas {

    private List<IShape> shapeList = new ArrayList<>();
    public void addNewShape(String shapeType){
        IShape shape = ShapeFactory.getShape(shapeType);
        shapeList.add(shape);
    }

    public void redraw(){
        Iterator<IShape> shapeIterator = shapeList.iterator();
        while (shapeIterator.hasNext()){
            IShape iShape = shapeIterator.next();
            iShape.draw();
        }
    }

    public void refillColor(){
        Iterator<IShape> shapeIterator = shapeList.iterator();
        while (shapeIterator.hasNext()){
            IShape iShape = shapeIterator.next();
            iShape.fillColor();
        }
    }

}
