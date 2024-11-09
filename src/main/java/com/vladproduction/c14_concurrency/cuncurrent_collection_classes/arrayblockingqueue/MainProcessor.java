package com.vladproduction.c14_concurrency.cuncurrent_collection_classes.arrayblockingqueue;

import java.util.concurrent.ArrayBlockingQueue;

public class MainProcessor {
    public static void main(String[] args) {

        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5); // Bounded queue of size 5
        int maxProducingElements = 10;

        ProducerElements producerElements = new ProducerElements(queue, maxProducingElements);
        ConsumerElements consumerElements = new ConsumerElements(queue);

        Thread producerThread = new Thread(producerElements);
        Thread consumerThread = new Thread(consumerElements);

        producerThread.start();
        consumerThread.start();

        // Let the tasks run for 5 seconds
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Interrupt the producerThread
        System.out.println("Main thread is interrupting the producerThread...");
        producerThread.interrupt(); // Request the thread to stop

        // Interrupt the consumerThread
        System.out.println("Main thread is interrupting the consumerThread...");
        consumerThread.interrupt(); // Request the thread to stop

        // Optionally, wait for the tasks thread to finish
        try {
            producerThread.join();
            consumerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread finished execution.");

    }
}
