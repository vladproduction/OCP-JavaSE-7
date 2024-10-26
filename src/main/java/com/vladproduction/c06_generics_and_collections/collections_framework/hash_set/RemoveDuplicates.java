package com.vladproduction.c06_generics_and_collections.collections_framework.hash_set;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        version1();
//        version2();

    }

    private static void version1() {
//        String tongueTwister = "I feel, a feel, a funny feel, a funny feel I feel,  if you feel the feel I feel, I feel the feel you feel";
        String tongueTwister = "Manchester United is an English professional football club based in Trafford, Greater Manchester. " +
                "It was founded in 1878 as Newton Heath, changing its name to Manchester United in 1902. " +
                "One of the most popular football clubs in the world. One of the founders of the English Premier League in 1992.";
        Set<String> words = new HashSet<>();
        List<String> totalWords = new ArrayList<>();
        // split the sentence into words and try putting them in the set
        for(String word : tongueTwister.split("\\W+")){
            words.add(word);
            totalWords.add(word);
        }

        System.out.println("Total words: " + totalWords.size());
        System.out.println("Used words: " + words.size());

        System.out.println("The tongue twister is: " + tongueTwister);
        System.out.print("The words used were: ");
        System.out.println(words);
    }

    //other version to add words into collection:
    /*private static void version2() {
        String tongueTwister = "I feel, a feel, a funny feel, a funny feel I feel,  if you feel the feel I feel, I feel the feel you feel";
        Set<String> words = new HashSet<>();
        // split the sentence into words and try putting them in the set
        Collections.addAll(words, tongueTwister.split("\\W+"));

        System.out.println("The tongue twister is: " + tongueTwister);
        System.out.print("The words used were: ");
        System.out.println(words);
    }*/
}
