package com.vladproduction.c13_threads.concurrent_access_problems._5_wait_notify.dice_throwing_game_solution;

import java.util.Random;

/**
 * The class Dice abstracts how the dice are rolled;
 * it also remembers the turns that the players take.
 * */
public class Dice {

    private static String turn = null; // to remember whose turn it is to roll the dice
    private static Random random=new Random();// when we roll the dice, it should give a random result

    // prevent instantiating the class by making it private (we've only static members)
    private Dice() {}

    //synchronizing getter & setter for turn
    synchronized public static String getTurn() {
        return turn;
    }

    public static void setTurn(String player) {
        turn = player;
    }

    // method for which player starts the game
    public static void setWhoStartGame(String name){
        turn = name;
    }

    //method for random.nextInt(6) gives values from 0 to 5, so add 1 to result in roll()
    public static int roll() {
        return random.nextInt(6) + 1;
    }

}
