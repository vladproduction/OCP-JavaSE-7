package com.vladproduction.c05_oop_design_principles.some_design_patterns.creational.singleton;

// implement the famous double-checked locking
//it creates a problem due to erroneous out-of-order writes allowed by the Java memory model
public class Logger4 {
    private Logger4(){}
    private static Logger4 myInstance;

    public static Logger4 getInstance(){
        if(myInstance == null) {
            synchronized (Logger4.class) {
                if(myInstance == null) {
                    myInstance = new Logger4();
                }
            }
        }
        return myInstance;
    }

    public void log(String s) {
        System.err.println(s);
    }

    public static void main(String[] args) {
        Logger4 logger = Logger4.getInstance();
//        logger.log(logger.toString().substring(87));
        logger.log("log message");
//        System.out.println(logger.hashCode());

        Runnable task = () -> {
            Logger4 loggerThread = Logger4.getInstance();
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
