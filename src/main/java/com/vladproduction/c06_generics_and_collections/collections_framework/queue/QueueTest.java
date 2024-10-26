package com.vladproduction.c06_generics_and_collections.collections_framework.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {

            Queue<String> loginSequence = new LinkedList<>();

            loginSequence.add("Harrison");
            loginSequence.add("McCartney");
            loginSequence.add("Starr");
            loginSequence.add("Lennon");
            System.out.println("The login sequence is: " + loginSequence);
            while(!loginSequence.isEmpty())
                System.out.println("Removing " + loginSequence.remove());

    }
}
