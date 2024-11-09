package com.vladproduction.c14_concurrency.executors_and_threadpools.thread_lockal_random;

import java.util.concurrent.ThreadLocalRandom;

public class RandomNumberGenerator implements Runnable{

    private final int id;

    public RandomNumberGenerator(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        // Get current instance of ThreadLocalRandom
        ThreadLocalRandom random = ThreadLocalRandom.current();

        // Generate and print 5 random numbers between 0 and 100
        for (int i = 0; i < 5; i++) {
            int randomNum = random.nextInt(0, 100); // 0 (inclusive) to 100 (exclusive)
            System.out.println("Thread " + id + ": " + randomNum);
        }
    }
}
