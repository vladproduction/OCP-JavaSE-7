package com.vladproduction.c05_oop_design_principles.some_design_patterns.abstract_factory2;

public class TeslaFactory implements VehicleFactory {
    @Override
    public Car createCar() {
        return new TeslaCar();
    }

    @Override
    public Truck createTruck() {
        return new TeslaTruck();
    }
}