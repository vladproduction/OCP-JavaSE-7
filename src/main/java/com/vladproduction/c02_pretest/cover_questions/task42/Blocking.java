package com.vladproduction.c02_pretest.cover_questions.task42;

import java.util.Deque;
import java.util.concurrent.LinkedBlockingDeque;

public class Blocking {
    Deque<String> gangOfFour = new LinkedBlockingDeque<>();

    class Producer extends Thread{
        String []authors = { "E Gamma", "R Johnson", "R Helm", "J Vlissides" };
        @Override
        public void run() {
            for(String author : authors) {
                gangOfFour.add(author);
                try {
                    // take time to add
                    Thread.sleep(1000);
                }
                catch(InterruptedException ie) {
                    // ignore it
                }
            }
        }
    }

    class Consumer extends Thread{
        int numOfAuthors = 4;
        int processedAuthors = 0;
        @Override
        public void run() {
            while(processedAuthors < numOfAuthors) {
                while (gangOfFour.isEmpty()) {
                    /*wait till an entry is inserted*/
                }
                System.out.println(gangOfFour.remove()); //the head of the queue represented by this deque
                processedAuthors++;
            }
        }
    }

    public static void main(String []args) {
        Blocking blocking = new Blocking();
        blocking.new Producer().start();
        blocking.new Consumer().start();
        //output:
        /*E Gamma
        R Johnson
        R Helm
        J Vlissides*/
    }

}

/*Which one of the following options correctly describes the behavior of this program?

a) Prints
E Gamma
and then the program terminates.

b) Prints
E Gamma
R Johnson
R Helm
J Vlissides
and then the program enters a deadlock and never terminates.

+++c) Prints
E Gamma
R Johnson
R Helm
J Vlissides
and then the program terminates.

d) Prints
J Vlissides
R Helm
R Johnson
E Gamma
and then the program terminates.

e) The program does not print any output, enters a deadlock, and never terminates.*/
