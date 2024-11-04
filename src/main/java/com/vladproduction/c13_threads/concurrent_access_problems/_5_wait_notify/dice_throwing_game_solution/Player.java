package com.vladproduction.c13_threads.concurrent_access_problems._5_wait_notify.dice_throwing_game_solution;

/**
 * class Player abstracts a player playing the Dice game.
 * Each player runs as a separate thread, so Player extends the Thread class (or implementing Runnable)
 * */
public class Player implements Runnable{

    private String currentPlayer = null;
    private String otherPlayer = null;

    //constructor
    // we've only two players; we remember them in currentPlayer and otherPlayer
    public Player(String thisPlayer){
        currentPlayer = thisPlayer;
        otherPlayer = thisPlayer.equals(Gamers.JOE) ? Gamers.BOB : Gamers.JOE;
    }

    @Override
    public void run() {
        // each player rolls the dice 6 times in the game
        for (int i = 0; i < 6; i++) {
            // acquire the lock before proceeding
            synchronized (Dice.class){
                // if its not currentPlayer's turn, then
                // wait for otherPlayers's notification
                while (!Dice.getTurn().equals(currentPlayer)){
                    try{
                        Dice.class.wait(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                // its currentPlayer's turn now; throw the dice
                System.out.println(Dice.getTurn()+" throws " + Dice.roll());
                // set the turn to otherPlayer, and notify the otherPlayer
                Dice.setTurn(otherPlayer);
                Dice.class.notifyAll();
            }
        }
    }

}
