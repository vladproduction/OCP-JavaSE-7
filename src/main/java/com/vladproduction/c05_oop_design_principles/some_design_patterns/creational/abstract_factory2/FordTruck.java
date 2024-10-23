package com.vladproduction.c05_oop_design_principles.some_design_patterns.creational.abstract_factory2;

public class FordTruck implements Truck {
    @Override
    public void haul() {
        System.out.println("Hauling with a Ford Truck");
    }
}