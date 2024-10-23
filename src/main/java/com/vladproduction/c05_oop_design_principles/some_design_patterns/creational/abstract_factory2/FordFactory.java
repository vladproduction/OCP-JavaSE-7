package com.vladproduction.c05_oop_design_principles.some_design_patterns.creational.abstract_factory2;

public class FordFactory implements VehicleFactory {
    @Override
    public Car createCar() {
        return new FordCar();
    }

    @Override
    public Truck createTruck() {
        return new FordTruck();
    }
}