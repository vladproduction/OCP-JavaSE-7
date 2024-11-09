package com.vladproduction.c14_concurrency.synchronizers.countdownlatch;

import java.util.concurrent.CountDownLatch;

/**
 * // this Runner class simulates a track runner in a 100-meter dash race. The runner waits until the
 * // count down timer gets to zero and then starts running
 * */
public class Runner extends Thread{
    private CountDownLatch timer;

    public Runner(CountDownLatch timer, String name) {
        this.timer = timer;
        this.setName(name);
        System.out.println(this.getName() + " ready and waiting to count down to start.");
        start();
    }

    @Override
    public void run() {
        try {
            // wait for the timer count down to reach 0
            timer.await();
        } catch (InterruptedException e) {
            System.err.println("interrupted -- can't start running the race");
            throw new RuntimeException(e);
        }
        System.out.println(this.getName() + " started running");
    }
}
