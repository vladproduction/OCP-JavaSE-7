package com.vladproduction.c06_generics_and_collections.collections_framework.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeTest {
    private Deque<String> splQ = new ArrayDeque<>();
    void addInQueue(String customer){
        splQ.addLast(customer);
    }
    void removeFront(){
        splQ.removeFirst();
    }
    void removeBack(){
        splQ.removeLast();
    }
    void printQueue(){
        System.out.println("Special queue contains: " + splQ);
    }

    public static void main(String []args) {
        ArrayDequeTest splQ = new ArrayDequeTest();
        splQ.addInQueue("Harrison");
        splQ.addInQueue("McCartney");
        splQ.addInQueue("Starr");
        splQ.addInQueue("Lennon");

        splQ.printQueue(); //Special queue contains: [Harrison, McCartney, Starr, Lennon]
        splQ.removeFront(); //Harrison
        splQ.removeBack(); //Lennon
        splQ.printQueue(); //Special queue contains: [McCartney, Starr]
    }
}
