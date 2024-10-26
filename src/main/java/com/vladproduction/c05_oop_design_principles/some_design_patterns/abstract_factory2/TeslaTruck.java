package com.vladproduction.c05_oop_design_principles.some_design_patterns.abstract_factory2;

public class TeslaTruck implements Truck {
    @Override
    public void haul() {
        System.out.println("Hauling with a Tesla Truck");
    }
}