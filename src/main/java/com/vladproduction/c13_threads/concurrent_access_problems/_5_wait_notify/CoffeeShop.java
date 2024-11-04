package com.vladproduction.c13_threads.concurrent_access_problems._5_wait_notify;

/**
 * This class instantiates two threads - CoffeeMachine and Waiter threads
 * and these two threads interact with each other through wait/notify
 * till you terminate the application explicitly by pressing Ctrl-C
 * */
public class CoffeeShop {
    public static void main(String[] args) {

        CoffeeMachine machine = new CoffeeMachine();
        Waiter waiter = new Waiter();

        machine.start();
        waiter.start();

    }
}
