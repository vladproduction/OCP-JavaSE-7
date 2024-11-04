package com.vladproduction.c13_threads.intro;

public class SimpleThread {
    public static void main(String[] args) {
        Thread t = new Thread();
        System.out.println(t);//Thread[Thread-0,5,main]
        //where:
        //1)name: Thread-0
        //2)priority: 5 (could be from 1 to 10)
        //3)group: main

        /*the default name Thread-0 was given (as you create more threads, threads
        will be given names like Thread-1, Thread-2, etc). The default priority is 5. You created the thread in main(), so the
        default thread group is “main.”*/

        //change some of the properties: (name and priority)
        Thread t2= new Thread();
        t2.setName("SimpleThread");
        t2.setPriority(9);
        System.out.println(t2); //Thread[SimpleThread,9,main]
    }
}
