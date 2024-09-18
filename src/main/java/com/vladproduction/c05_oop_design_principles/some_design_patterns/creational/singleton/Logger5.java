package com.vladproduction.c05_oop_design_principles.some_design_patterns.creational.singleton;

//based on 'demand holder' idiom
//uses inner classes and does not use any synchronization construct
//the fact that inner classes are not loaded until they are referenced
public class Logger5 {
    private Logger5(){}
    public static class Logger5Holder{
        public static Logger5 logger5 = new Logger5();
    }
    public static Logger5 getInstance(){
        return Logger5Holder.logger5;
    }

    public static void main(String[] args) {
        Logger5 logger = Logger5.getInstance();
        System.out.println(logger.hashCode());

        Runnable task = () -> {
            Logger5 loggerThread = Logger5.getInstance();
            System.out.println(loggerThread.hashCode());
        };

        //create some threads and start them:
        for (int i = 0; i < 5; i++) {
            new Thread(task).start();
        }

    }

}
