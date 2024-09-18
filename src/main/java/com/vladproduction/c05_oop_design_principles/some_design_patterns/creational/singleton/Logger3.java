package com.vladproduction.c05_oop_design_principles.some_design_patterns.creational.singleton;

//synchronized based on class; only for the new statement;
//this solution does not work either. The synchronization does not prevent the accidental creation of two singleton objects
public class Logger3 {
    private Logger3(){}
    private static Logger3 myInstance;

    public static Logger3 getInstance() {
        if(myInstance == null) {
            synchronized (Logger3.class) {
                myInstance = new Logger3();
            }
        }
        return myInstance;
    }
    public void log(String s) {
        // log implementation
        System.err.println(s);
    }

    public static void main(String[] args) {
        Logger3 logger = Logger3.getInstance();
//        logger.log(logger.toString().substring(87));
        logger.log("log message");
//        System.out.println(logger.hashCode());

        Runnable task = () -> {
            Logger3 loggerThread = Logger3.getInstance();
//            loggerThread.log(loggerThread.toString().substring(87));
            loggerThread.log("Log message from thread " + Thread.currentThread().getName());
//            System.out.println(loggerThread.hashCode());
        };

        //create some threads and start them:
        for (int i = 0; i < 5; i++) {
            new Thread(task).start();
        }

    }

}
