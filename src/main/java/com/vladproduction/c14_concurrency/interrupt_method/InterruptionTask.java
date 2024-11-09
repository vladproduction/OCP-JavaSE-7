package com.vladproduction.c14_concurrency.interrupt_method;

public class InterruptionTask extends Thread{

    @Override
    public void run() {
        try {
            while (true) {
                // Simulating some work
                System.out.println("Working...");

                // Sleep for a while to simulate work being done
                Thread.sleep(1000); // Sleep time can be interrupted
            }
        }catch (InterruptedException e){
            System.out.println("InterruptionTask thread was interrupted! Exiting gracefully...");
            // Clean up resources or perform other exit operations here
        }
    }
}
