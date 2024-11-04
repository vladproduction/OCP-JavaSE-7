package com.vladproduction.c13_threads.concurrent_access_problems._5_wait_notify;

/**
 * The Waiter runs as an independent thread
 * It interacts with the CoffeeMachine to wait for a coffee
 * and deliver the coffee once ready and request the coffee machine
 * for the next one, and this activity keeps going on forever ...
 * */
public class Waiter extends Thread{

    public void getCoffee() {
        //try to acquire a lock on CoffeeMachine.lock
        synchronized(CoffeeMachine.lock) {
            // once it gets the lock, it checks if the coffeeMade is null
            // if the variable is null, it means the CoffeeMachine thread is still preparing the coffee
            if(CoffeeMachine.coffeeMade == null) {
                try {
                    // wait till the CoffeeMachine says (notifies) that coffee is ready
                    System.out.println("Waiter: Will get orders till coffee machine notifies me ");
                            CoffeeMachine.lock.wait();
                }
                catch(InterruptedException ie) {
                    // its okay to ignore this exception
                    // since we're not using thread interrupt mechanism
                    ie.printStackTrace();
                }
            }
            System.out.println("Waiter: Delivering " + CoffeeMachine.coffeeMade);
            CoffeeMachine.coffeeMade=null;
            // ask (notify) the coffee machine to prepare the next coffee
            CoffeeMachine.lock.notifyAll();
            System.out.println("Waiter: Notifying coffee machine to make another one");
        }
    }

    /**
     * it keeps calling the getCoffee() method forever
     * */
    public void run() {
        // keep going till the user terminates the program
        while(true) {
            getCoffee();
        }
    }

    //description:
        /*In that case, the Waiter thread calls wait() and then prints the message, “Will get orders till coffee machine notifies me”.
        When the CoffeeMachine thread has made the coffee, it will set the variable coffeeMade, and it will be non-null then;
        that thread will also notify the Waiter thread using notifyAll().
        Once the Waiter thread gets notified, it can deliver the coffee to the customer; it prints the message “Delivering coffee”.
        After that, it clears the coffeeMade variable to null and notifies the CoffeeMachine to make another coffee
        (“Notifying coffee machine to make another one”).*/

}
