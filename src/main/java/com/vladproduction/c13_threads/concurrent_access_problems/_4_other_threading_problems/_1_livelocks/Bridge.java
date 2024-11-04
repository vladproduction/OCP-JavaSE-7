package com.vladproduction.c13_threads.concurrent_access_problems._4_other_threading_problems._1_livelocks;

public class Bridge {

    private boolean isBeenCrossed = false;

    public synchronized  boolean crossedBridge(String carName){
        System.out.println(carName + " attempting to cross the bridge...");
        if(!isBeenCrossed){
            isBeenCrossed = true;
            return true;  // Car successfully crosses
        }
        return false; // Car must wait
    }

    public synchronized void leaveBridge(String carName) {
        isBeenCrossed = false; // Release the bridge
        System.out.println(carName + " has left the bridge.");
    }

}
