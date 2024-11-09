package com.vladproduction.c14_concurrency.executors_and_threadpools.thread_lockal_random;

public class TestRandomNumberGenerator {
    public static void main(String[] args) {
        //create array of threads
        Thread[] threads = new Thread[5];

        //initialize and start threads:
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(new RandomNumberGenerator(i + 1));
            threads[i].start();
        }

        //waiting for completing all threads:
        for (Thread thread : threads) {
            try {
                thread.join();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

        //flag is all threads finished:
        System.out.println("All threads finished generating numbers.");

    }
}
