package com.vladproduction.c02_pretest.cover_questions.task37;

public class Worker extends Thread{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
