package com.vladproduction.c14_concurrency.synchronizers.cyclicbarrier;

/**
 * The run() method in this thread should be called only when four players are ready to start the game
 * */
public class MixedDoubleTennisGame extends Thread {
    public void run() {
        System.out.println("All four players ready, game starts \n Love all...");
    }
}
