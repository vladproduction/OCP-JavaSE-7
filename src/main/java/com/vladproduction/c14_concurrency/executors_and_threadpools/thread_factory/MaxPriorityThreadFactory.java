package com.vladproduction.c14_concurrency.executors_and_threadpools.thread_factory;

import java.util.concurrent.ThreadFactory;

public class MaxPriorityThreadFactory implements ThreadFactory {
    private static long count = 0;
    public Thread newThread(Runnable r) {
        Thread temp = new Thread(r);
        temp.setName("priority thread " + count++);
        temp.setPriority(Thread.MAX_PRIORITY);
        return temp;
    }
}
