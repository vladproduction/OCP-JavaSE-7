package com.vladproduction.c13_threads.question_time;

public class quest1 {
    public static void main(String[] args) throws InterruptedException {
        Thread pingPong = new PingPong();
        pingPong.start();
        pingPong.join();
        System.out.println("pong");
        //ping
        //pong
        /*(The main thread creates the worker thread and waits for it to complete (which prints “ping”). After that it
        prints “pong”. So, this implementation correctly prints “ping pong”)*/
    }

}

class PingPong extends Thread {
    public void run() {
        System.out.println("ping");
    }

}
