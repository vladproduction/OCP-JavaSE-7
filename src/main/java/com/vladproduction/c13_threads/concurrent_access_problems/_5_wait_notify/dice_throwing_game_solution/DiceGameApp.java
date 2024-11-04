package com.vladproduction.c13_threads.concurrent_access_problems._5_wait_notify.dice_throwing_game_solution;

import static com.vladproduction.c13_threads.concurrent_access_problems._5_wait_notify.dice_throwing_game_solution.Gamers.*;
import static com.vladproduction.c13_threads.concurrent_access_problems._5_wait_notify.dice_throwing_game_solution.Gamers.JOE;

/**
 * class DiceGame just starts the game by starting player threads
 * */
public class DiceGameApp {
    public static void main(String[] args) {

        Thread p1 = new Thread(new Player(JOE));
        Thread p2 = new Thread(new Player(BOB));

        Dice.setWhoStartGame(JOE);

        p1.start();
        p2.start();

    }
}
