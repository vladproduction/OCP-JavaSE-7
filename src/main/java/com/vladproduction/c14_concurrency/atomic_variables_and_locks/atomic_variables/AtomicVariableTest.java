package com.vladproduction.c14_concurrency.atomic_variables_and_locks.atomic_variables;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Class to demonstrate how incrementing "normal" (i.e., thread unsafe) integers and incrementing
 * "atomic" (i.e., thread safe) integers are different: Incrementing a shared Integer object without locks can result
 * in a data race; however, incrementing a shared AtomicInteger will not result in a data race
 * */
public class AtomicVariableTest {

    //creating two variables (one is normal Integer and one as AtomicInteger) - with same initial value
    private static Integer nonAtomicCounter = 0; // regular Integer, not thread-safe
    private static AtomicInteger atomicCounter =  new AtomicInteger(0); // AtomicInteger, thread-safe

    //creating threads to operate with variables:
    static class IntegerIncrementer extends Thread{
        @Override
        public void run() {
            // Perform a small number of increments to increase chances of data race
            for (int i = 0; i < 100; i++) {
                System.out.println("Non-Atomic Integer is: " + ++nonAtomicCounter);
            }
        }
    }

    static class AtomicIntegerIncrementer extends Thread{
        @Override
        public void run() {
            // Perform the same number of increments
            for (int i = 0; i < 100; i++) {
                System.out.println("AtomicInteger is: " + atomicCounter.incrementAndGet());
            }
        }
    }

    public static void main(String[] args) {
        Thread[] threads = new Thread[20]; //20 threads holder (10 Integer + 10 AtomicInteger)

        //creating threads and starts respectively
        for (int i = 0; i < 10; i++) {
            threads[i] = new IntegerIncrementer();
            threads[i + 10] = new AtomicIntegerIncrementer();
            threads[i].start();
            threads[i + 10].start();
        }

        //wait to all threads to finish (join method action is essential):
        for (Thread thread : threads) {
            try{
                thread.join();
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
                System.err.println("Thread was interrupted");
            }
        }

        //print result to compare Integer and AtomicInteger:
        System.out.println("Final Non-Atomic Integer value: " + nonAtomicCounter);
        System.out.println("Final AtomicInteger value: " + atomicCounter.get());

        //result is unpredictable for Integer as expected, not thread safe;
        //output shows that incrementing the Integer value is prone to a data race when it is without a lock,
        // whereas it is safe to increment the AtomicInteger value without any locks;
        /*Final Non-Atomic Integer value: 998
        Final AtomicInteger value: 1000*/


    }
}
