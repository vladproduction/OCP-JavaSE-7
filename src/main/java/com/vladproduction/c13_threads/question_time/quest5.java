package com.vladproduction.c13_threads.question_time;

public class quest5 {}
    //Which of the following two definitions of Sync (when compiled in separate files) will compile without errors?

    //A
    class Sync1 {
        public synchronized void foo() {}
    }

    //B
    abstract class Sync2 {
        public synchronized void foo() {}
    }

    //C
    /*abstract class Sync3 {
        public abstract synchronized void foo();
    }*/

    //D
    /*interface Sync4 {
        public synchronized void foo();
    }*/

    /*Answer: A. and B.
     (Abstract methods (in abstract classes or interfaces) cannot be declared synchronized, hence the options C
     and D are incorrect.)*/

