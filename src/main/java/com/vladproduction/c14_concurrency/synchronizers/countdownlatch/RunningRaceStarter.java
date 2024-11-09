package com.vladproduction.c14_concurrency.synchronizers.countdownlatch;

import java.util.concurrent.CountDownLatch;

/**
 * // this class simulates the start of a running race by counting down from 5. It holds
 * // three runner threads to be ready to start in the start line of the race and once the count down
 * // reaches zero, all the three runners start running...
 * */
public class RunningRaceStarter {
    public static void main(String []args) throws InterruptedException {
        CountDownLatch counter = new CountDownLatch(5);
        // count from 5 to 0 and then start the race

        // instantiate three runner threads
        new Runner(counter, "Carl");
        new Runner(counter, "Joe");
        new Runner(counter, "Jack");

        System.out.println("Starting the countdown ");
        long countVal = counter.getCount();
        while(countVal > 0) {
            Thread.sleep(1000); // 1000 milliseconds = 1 second
            System.out.println(countVal);
            if(countVal == 1) {
                // once counter.countDown(); in the next statement is called,
                // Count down will reach zero; so shout "Start"
                System.out.println("Start");
            }
            counter.countDown(); // count down by 1 for each second
            countVal = counter.getCount();
        }
    }
}

    //theory description:
    /*When you create a CountDownLatch, you initialize it with an integer, which represents a count value. Threads
would wait (by calling the await() method) for this count to reach zero. Once zero is reached, all threads are
released; any other calls to await() would return immediately since the count is already zero. The counter value can
be decremented by one by calling the countDown() method. You can get the current value of the counter using the
getCount() method.*/

    //how this program work:
/*The class Runner simulates a runner in a running race waiting to start running.
It waits for the race to start by calling the await() method on the CountDownLatch object passed through the constructor.
The RunningRaceStarter class creates a CountDownLatch object. This counter object is initialized with the count
value 5, which means the countdown is from 5 to 0. In the main() method, you create Runner objects; these three
threads wait on the counter object. For each second, you call the countDown() method, which decrements count by 1.
Once the count reaches zero, all three waiting threads are released and they automatically continue execution.*/
