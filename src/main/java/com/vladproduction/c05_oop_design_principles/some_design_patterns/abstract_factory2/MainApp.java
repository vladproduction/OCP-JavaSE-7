package com.vladproduction.c05_oop_design_principles.some_design_patterns.abstract_factory2;

public class MainApp {
    public static void main(String[] args) {
        // Create a Ford vehicle factory
        VehicleFactory fordFactory = new FordFactory();

        // Create Ford products
        Car fordCar = fordFactory.createCar();
        Truck fordTruck = fordFactory.createTruck();

        fordCar.drive(); // Output: Driving a Ford Car
        fordTruck.haul(); // Output: Hauling with a Ford Truck

        // Create a Tesla vehicle factory
        VehicleFactory teslaFactory = new TeslaFactory();

        // Create Tesla products
        Car teslaCar = teslaFactory.createCar();
        Truck teslaTruck = teslaFactory.createTruck();

        teslaCar.drive(); // Output: Driving a Tesla Car
        teslaTruck.haul(); // Output: Hauling with a Tesla Truck
    }
}
