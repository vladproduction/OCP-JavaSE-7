package com.vladproduction.c06_generics_and_collections.collections_framework.deque;

import java.util.concurrent.LinkedBlockingDeque;

public class LinkedBlockingDequeTest {
    public static void main(String[] args) {

        LinkedBlockingDeque<String> deque = new LinkedBlockingDeque<>(10);
        try{
            deque.putFirst("element-1");
            deque.putLast("element-2");
            deque.putFirst("element-3");
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }

        // Print the deque
        System.out.println("Deque after additions: " + deque);

        // Removing elements from the deque
        try {
            String firstElement = deque.takeFirst(); // Remove from the front
            String lastElement = deque.takeLast();   // Remove from the end
            System.out.println("Removed from front: " + firstElement);
            System.out.println("Removed from end: " + lastElement);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        // Print the deque after removals
        System.out.println("Deque after removals: " + deque);

    }
}
