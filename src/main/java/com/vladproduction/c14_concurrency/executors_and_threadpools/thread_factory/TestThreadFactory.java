package com.vladproduction.c14_concurrency.executors_and_threadpools.thread_factory;

import java.util.concurrent.ThreadFactory;

public class TestThreadFactory {
    public static void main(String[] args) {
        ThreadFactory threadFactory = new MaxPriorityThreadFactory();
        Thread thread1 = threadFactory.newThread(new ARunnable());
        System.out.println("Thread name: " + thread1.getName());
        System.out.println("Thread priority: " + thread1.getPriority());
        thread1.start();
    }
}
