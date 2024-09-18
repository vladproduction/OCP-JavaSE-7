package com.vladproduction.c05_oop_design_principles.some_design_patterns.creational.singleton;

// Logger class must be intantiated only once in the application; it is to ensure that the
// whole of the application makes use of that same logger instance
public class Logger1 {

    // declare the constructor private to prevent clients
    // from instantiating an object of this class directly
    private Logger1(){}
    private static Logger1 myInstance; // by default, this field is initialized to null

    // the static method to be used by clients to get the instance of the Logger class
    public static Logger1 getInstance(){
        if(myInstance == null) {
            // this is the first time this method is called, and that's why myInstance is null
            myInstance = new Logger1();
        }
        // return the same object reference any time and every time getInstance is called
        return myInstance;
    }

    public void log(String s) {
        // a trivial implementation of log where we pass the string to be logged to console
        System.err.println(s);
    }

    public static void main(String[] args) {
        Logger1 logger1 = Logger1.getInstance();
        logger1.log(logger1.toString().substring(87));
        Logger1 logger2 = Logger1.getInstance();
        logger2.log(logger2.toString().substring(87));
        String name = "com.vladproduction.c05_oop_design_principles.some_design_patterns.creational.singleton.Logger1@65ab7765";
        System.out.println(name.length());
    }

}
