package com.vladproduction.c14_concurrency.executors_and_threadpools.executor;

/**
 * This Task class implements Runnable, so it`s a Thread object
 * */
public class Task implements Runnable{

    @Override
    public void run() {
        System.out.println("Calling Task.run() ");
    }
}
