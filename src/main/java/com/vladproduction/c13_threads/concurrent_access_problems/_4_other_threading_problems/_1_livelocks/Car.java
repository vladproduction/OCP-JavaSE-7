package com.vladproduction.c13_threads.concurrent_access_problems._4_other_threading_problems._1_livelocks;

public class Car extends Thread{

    private final String name;
    private final Bridge bridge;

    public Car(String name, Bridge bridge) {
        this.name = name;
        this.bridge = bridge;
    }

    @Override
    public void run() {
        while (true){
            if (bridge.crossedBridge(name)) {
                System.out.println(name + " is crossing the bridge.");
                // Allow the car to cross the bridge for a moment
                try {
                    Thread.sleep(3000); // Simulate time crossing
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                bridge.leaveBridge(name); // Indicate that the car has left
                break; // Exit after crossing
            } else {
                System.out.println(name + " is waiting.");
                // Introduce a longer randomized delay to promote progress
                try {
                    Thread.sleep((long) (Math.random() * 500 + 100)); // Random 100 to 600ms
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
