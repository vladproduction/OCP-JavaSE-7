package com.vladproduction.c13_threads.intro;

public class UsingSleep extends Thread {
    String[] timeStr = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight",
            "Nine"};

    public static void main(String[] s) {
        UsingSleep timer = new UsingSleep();
        System.out.println("Starting 10 second count down... ");
        timer.start();
        System.out.println("Boom!!!");
    }

    /**
     * NOTE:
     * The sleep() method throws InterruptedException. Since InterruptedException is a checked exception
     * (it extends from the Exception class), you need to provide a try-catch block around sleep() or declare the
     * run() method that throws the exception InterruptedException. However, if you declare void run() throws
     * InterruptedException, you won’t be overriding the run() method since the exception specification is different
     * (the run() method does not throw any checked exceptions). So, you must provide a try-catch block to handle this
     * exception within run()
     * */
    @Override
    public void run() {
        for (int i = 9; i >= 0; i--) {
            try {
                System.out.println(timeStr[i]);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

