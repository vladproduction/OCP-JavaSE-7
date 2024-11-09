package com.vladproduction.c14_concurrency.synchronizers.phaser;

import java.util.concurrent.Phaser;

/**
 * // ProcessOrder thread is the master thread overlooking to make sure that the Cook, Helper,
 * // and Attendant are doing their part of the work to complete preparing the food items
 * // and complete order delivery
 * // To simplify the logic, we assume that each delivery order consists of exactly three food items
 * */
public class ProcessOrder {
    public static void main(String []args) throws InterruptedException {
        // the Phaser is the synchronizer to make food items one-by-one,
        // and deliver it before moving to the next item
        Phaser deliveryOrder = new Phaser(1);
        System.out.println("Starting to process the delivery order ");

        new Worker(deliveryOrder, "Cook");
        new Worker(deliveryOrder, "Helper");
        new Worker(deliveryOrder, "Attendant");

        for(int i = 1; i <= 3; i++) {
            // Prepare, mix and deliver this food item
            deliveryOrder.arriveAndAwaitAdvance();
            System.out.println("Deliver food item no. " + i);
        }
        // work completed for this delivery order, so deregister
        deliveryOrder.arriveAndDeregister();
        System.out.println("Delivery order completed... give it to the customer");
    }
}
    //description:
/*
In this case, you’ve assumed that a delivery order consists of processing three food items, so the for loop runs
three times. For each iteration, you call deliveryOrder.arriveAndAwaitAdvance(). For this statement to proceed,
all the three parties (the Cook, Helper, and Attendant) have to complete their part of the work to prepare the food
item. You simulate “preparing food” by calling the sleep() method in the run method for these Worker threads. These
worker threads call deliveryOrder.arriveAndAwaitAdvance() for preparing each food item. As each food item is
prepared (i.e., each phase is completed), the work progresses to the next phase. Once three phases are complete, the
delivery order processing is complete and the program returns*/
