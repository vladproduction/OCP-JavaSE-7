package com.vladproduction.c14_concurrency.cuncurrent_collection_classes.arrayblockingqueue;

import java.util.concurrent.ArrayBlockingQueue;

public class ProducerElements implements Runnable {

    private final ArrayBlockingQueue<Integer> queue;
    private final int maxElementsContainQueue;

    public ProducerElements(ArrayBlockingQueue<Integer> queue, int maxElementsContainQueue) {
        this.queue = queue;
        this.maxElementsContainQueue = maxElementsContainQueue;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= maxElementsContainQueue; i++) {
                queue.put(i); //add elements to queue
                System.out.println("Produced: " + i);
                Thread.sleep(100); //simulating produce process
            }
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }
}
