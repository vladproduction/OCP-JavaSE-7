package com.vladproduction.c05_oop_design_principles.some_design_patterns.singleton;

// double-checked locking pattern improved (keyword volatile is in action)
public class Logger6 {

    // private static variable to hold the single instance
    private static volatile Logger6 myInstance;

    // private constructor to prevent instantiation
    private Logger6(){}

    // method to get the singleton instance
    public static Logger6 getInstance() {
        if (myInstance == null) { // first check (no locking)
            synchronized (Logger6.class) {
                if (myInstance == null) { // second check (with locking)
                    myInstance = new Logger6();
                }
            }
        }
        return myInstance;
    }

    // log method
    public void log(String s) {
        // log implementation
        System.err.println(s);
    }

    public static void main(String[] args) {
        // Test cases to demonstrate logging functionality
        Logger6 logger = Logger6.getInstance();
        logger.log("This is a log message.");

        // You can also create multiple threads to test the thread safety
        Runnable task = () -> {
            Logger6 loggerThread = Logger6.getInstance();
            loggerThread.log("Log message from thread " + Thread.currentThread().getName());
        };

        // Create multiple threads
        for (int i = 0; i < 5; i++) {
            new Thread(task).start();
        }
    }


}
