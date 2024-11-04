package com.vladproduction.c13_threads.concurrent_access_problems._4_other_threading_problems._1_livelocks;

public class Main {
    public static void main(String[] args) {
        //create common entity on which threads would synchronize
        Bridge bridge = new Bridge();

        //creating two threads (cars) with names consequently
        Car car1 = new Car("Car1", bridge);
        Car car2 = new Car("Car2", bridge);

        //starting threads at the same time
        //we do not got a livelock since added sleep (paused) for one of the threads used synchronised method
        car1.start();
        car2.start();
    }
}
