package com.vladproduction.c14_concurrency.atomic_variables_and_locks.conditions;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Assuming that multiple trains can arrive at a railway station, you need to wait for a specific train to arrive. Once
 * the train arrives that you’re interested in, you get a “notification” or “signal” from that train.
 *
 * Used the explicit Lock and Condition objects and use the await() and signalAll() methods in the Condition object;
 * */
public class RailwayStation {

    private static Lock station = new ReentrantLock();// A common lock for synchronization
    private static Condition joeArrival = station.newCondition();// Condition to wait or notify the arrival of Joe in the station


    // Train class simulates arrival of trains independently
    static class Train extends Thread {
        public Train(String name) {
            this.setName(name);
        }
        public void run() {
            station.lock();
            try {
                System.out.println(getName() + ": I've arrived in station ");
                if(getName().startsWith("IC1122")) {
                    // Joe is coming in train IC1122 - he announces it to us
                    joeArrival.signalAll();
                }
            }
            finally {
                station.unlock();
            }
        }
    }

    // Our wait in the railway station for Joe is simulated by this thread. Once we get notification from Joe
    // that he has arrived, we pick-him up and go home
    static class WaitForJoe extends Thread {
        public void run() {
            System.out.println("Waiting in the station for IC1122 in which Joe is coming");
            station.lock();
            try {
                // await Joe's train arrival
                joeArrival.await();
                // if this statement executes, it means we got a train arrival signal
                System.out.println("Pick up Joe and go home");
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            } finally {
                station.unlock();
            }
        }
    }


    public static void main(String []args) throws InterruptedException {
        // first create a thread that waits for Joe to arrive and then create new Train threads
        // we are waiting before the trains start coming
        new WaitForJoe().start();

        // Trains are separate threads - they can arrive in any order
        new Train("IC1234 - Paris to Munich").start();
        new Train("IC2211 - Paris to Madrid").start();
        new Train("IC1122 - Madrid to Paris").start();
        new Train("IC4321 - Munich to Paris").start();
    }

}
