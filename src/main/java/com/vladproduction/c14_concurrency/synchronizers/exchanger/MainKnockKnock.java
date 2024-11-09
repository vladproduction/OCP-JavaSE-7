package com.vladproduction.c14_concurrency.synchronizers.exchanger;

import java.util.concurrent.Exchanger;

/**
 * // Coordinate the silly talk between Duke and CoffeeShop by instantiating the Exchanger object
 * // and the CoffeeShop and Duke threads
 */
public class MainKnockKnock {
    public static void main(String[] args) {

        Exchanger<String> sillyTalk = new Exchanger<>();
        new CoffeeShopThread(sillyTalk).start();
        new DukeThread(sillyTalk).start();

    }
}

    //description:
    /*Main concept to understand with this example is that Exchanger helps coordinate (i.e., synchronize)
    exchanging messages between two threads. Both the threads wait for each other and use the exchange() method
    to exchange messages*/
