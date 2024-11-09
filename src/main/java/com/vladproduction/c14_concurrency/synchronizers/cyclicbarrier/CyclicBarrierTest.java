package com.vladproduction.c14_concurrency.synchronizers.cyclicbarrier;

import java.util.concurrent.CyclicBarrier;

/**
 * // Creates a CyclicBarrier object by passing the number of threads and the thread to run
 * // when all the threads reach the barrier
 * */
public class CyclicBarrierTest {
    public static void main(String[] args) {
        // a mixed-double tennis game requires four players; so wait for four players
        // (i.e., four threads) to join to start the game
        System.out.println("Reserving tennis court \n As soon as four players arrive, game will start");
        CyclicBarrier barrier = new CyclicBarrier(4, new MixedDoubleTennisGame());
        new Player(barrier, "G I Joe");
        new Player(barrier, "Dora");
        new Player(barrier, "Tintin");
        new Player(barrier, "Barbie");
    }
}
    //description:
    /*In the main() method you create a CyclicBarrier object. The constructor
takes two arguments: the number of threads to wait for, and the thread to invoke when all the threads reach the
barrier. In this case, you have four players to wait for, so you create four threads, with each thread representing a
player. The second argument for the CyclicBarrier constructor is the MixedDoubleTennisGame object since this
thread represents the game, which will start once all four players are ready.
Inside the run() method for each Player thread, you call the await() method on the CyclicBarrier
object. Once the number of awaiting threads for the CyclicBarrier object reaches four, the run() method in
MixedDoubleTennisGame is called.*/
