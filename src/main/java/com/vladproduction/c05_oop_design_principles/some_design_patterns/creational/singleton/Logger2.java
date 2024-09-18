package com.vladproduction.c05_oop_design_principles.some_design_patterns.creational.singleton;

//case for singleton design pattern in a multithreading environment
//but there is a problem: poor performance
// declared the whole method as synchronized, all subsequent calls to this method make it a performance bottleneck
public class Logger2 {
    private Logger2(){}
    private static Logger2 myInstance;

    public static synchronized Logger2 getInstance(){ // is a Java concurrency
        //mechanism to allow only one thread at a time into the synchronized scope
        if(myInstance == null){
            myInstance = new Logger2();
        }
        return myInstance;
    }

    public void log(String s){
        // log implementation
        System.err.println(s);
    }

    public static void main(String[] args) {
        Logger2 logger = Logger2.getInstance();
//        logger.log(logger.toString().substring(87));
//        logger.log("log message");
        System.out.println(logger.hashCode());


        Runnable task = () -> {
            Logger2 loggerThread = Logger2.getInstance();
//            loggerThread.log(loggerThread.toString().substring(87));
//            loggerThread.log("Log message from thread " + Thread.currentThread().getName());
            System.out.println(loggerThread.hashCode());
        };

        //create some threads and start them:
        for (int i = 0; i < 5; i++) {
            new Thread(task).start();
        }

    }

}
