package com.vladproduction.c13_threads.concurrent_access_problems._3_deadlocks;

/**
 * // Counter is a thread class that has two methods – IncrementBallAfterRun and IncrementRunAfterBall.
 * // For demonstrating deadlock, we call these two methods in the run method,
 * // so that locking can be requested in opposite order in these two methods
 * */
public class CountValuesClassRunnable implements Runnable{
    @Override
    public void run() {
        // call these two methods which acquire locks in different order
        // depending on thread scheduling and the order of lock acquisition,
        // a deadlock may or may not arise
        incrementBallAfterRun();
        incrementRunAfterBallThrows();

    }

    // this method increments runs variable first and then increments the balls variable
    // since these variables are accessible from other threads,
    // we need to acquire a lock before processing them
    public void incrementBallAfterRun(){
        // since we're updating runs variable first, lock the Runs.class reference first
        synchronized(Runs.class) {
            // now acquire lock on Balls.class variable before updating balls variable
            synchronized(Balls.class) {
                Runs.runs++;
                Balls.balls++;
            }
        }
    }

    public void incrementRunAfterBallThrows(){
        // since we're updating balls variable first, lock the Balls.class reference first
        synchronized(Balls.class) {
            // now acquire lock on Runs.class variable before updating runs variable
            synchronized(Runs.class) {
                Balls.balls++;
                Runs.runs++;
            }
        }
    }
}
