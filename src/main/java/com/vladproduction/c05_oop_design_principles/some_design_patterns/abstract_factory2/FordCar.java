package com.vladproduction.c05_oop_design_principles.some_design_patterns.abstract_factory2;

public class FordCar implements Car {
    @Override
    public void drive() {
        System.out.println("Driving a Ford Car");
    }
}