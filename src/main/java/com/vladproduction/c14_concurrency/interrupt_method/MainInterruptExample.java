package com.vladproduction.c14_concurrency.interrupt_method;

public class MainInterruptExample {
    public static void main(String[] args) {

        InterruptionTask task = new InterruptionTask();
        task.start();

        // Let the task run for 5 seconds
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Interrupt the thread
        System.out.println("Main thread is interrupting the worker thread...");
        task.interrupt(); // Request the thread to stop

        // Optionally, wait for the task thread to finish
        try {
            task.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread finished execution.");

    }
}
