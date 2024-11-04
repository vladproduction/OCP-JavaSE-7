package com.vladproduction.c13_threads.concurrent_access_problems._5_wait_notify;

/** The CoffeeMachine class runs as an independent thread.
 * Once the machine makes a coffee, it notifies the waiter to pick it up.
 * When the waiter asks the coffee machine to make a coffee again,
 * it starts all over again, and this process keeps goes on ...
 */
public class CoffeeMachine extends Thread{

    static String coffeeMade=null;//The coffeeMade member has the string description for the coffee that it has made
    static final Object lock=new Object();//The lock member is for the synchronization between the CoffeeMachine and Waiter threads
    private static int coffeeNumber=1;//The numOfCoffees is used internally by the makeCoffee() method to get the description of the coffee made

    void makeCoffee() {
        //it does is acquire the lock CoffeeMachine.lock using the synchronized keyword
        synchronized(CoffeeMachine.lock) {
            //Inside the block, it checks if the coffeeMade is null or not
            if(coffeeMade !=null) {
                try {
                    System.out.println("Coffee machine: Waiting for waiter notification to deliver the coffee");
                            CoffeeMachine.lock.wait();
                }
                catch(InterruptedException ie) {
                    ie.printStackTrace();
                }
            }
            coffeeMade="Coffee No. "+coffeeNumber ++;
            System.out.println("Coffee machine says: Made " + coffeeMade);
            // once coffee is ready, notify the waiter to pick it up
            CoffeeMachine.lock.notifyAll();
            System.out.println("Coffee machine: Notifying waiter to pick the coffee ");
        }
    }

    public void run() {
        while(true) {
            makeCoffee();
            try {
                System.out.println("Coffee machine: Making another coffee now");
                // simulate the time taken to make a coffee by calling sleep method
                Thread.sleep(10000);
            }
            catch(InterruptedException ie) {
                // it`s okay to ignore this exception
                // since we're not using thread interrupt mechanism
                ie.printStackTrace();
            }
        }
    }

    //description:
        /*The first time the CoffeeMachine thread calls the makeCoffee() method, coffeeMade will be null.
        In other cases, it is the Waiter thread that makes coffeeMade null and notifies (using the notifyAll() method) the CoffeeMachine thread.
        If the Waiter thread has not cleared it yet, it goes to the wait() state and prints the message, “Waiting for waiter notification to
        deliver the coffee”.
        Once the Waiter notifies the CoffeeMachine thread, the machine delivers the next coffee to the waiter; it prints
        the message notifying the waiter to pick up the coffee.*/

}
