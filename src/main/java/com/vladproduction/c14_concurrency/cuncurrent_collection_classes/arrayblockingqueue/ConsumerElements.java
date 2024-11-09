package com.vladproduction.c14_concurrency.cuncurrent_collection_classes.arrayblockingqueue;

import java.util.concurrent.ArrayBlockingQueue;

public class ConsumerElements implements Runnable{

    private final ArrayBlockingQueue<Integer> queue;

    public ConsumerElements(ArrayBlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            //using while loop as infinity process for taking elements
            while (true){
                Integer takenElement = queue.take(); //taking (consume) element from queue
                System.out.println("Consumed element: " + takenElement);
                Thread.sleep(200); //simulating work for consuming element
            }
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }
}
