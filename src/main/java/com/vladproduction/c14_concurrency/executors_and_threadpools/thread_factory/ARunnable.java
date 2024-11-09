package com.vladproduction.c14_concurrency.executors_and_threadpools.thread_factory;

public class ARunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("Running the created thread ");
    }
}
