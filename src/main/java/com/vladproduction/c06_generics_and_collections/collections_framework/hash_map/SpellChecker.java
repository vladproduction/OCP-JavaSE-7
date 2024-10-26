package com.vladproduction.c06_generics_and_collections.collections_framework.hash_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SpellChecker {
    public static void main(String[] args) {
        Map<String, String> misspeltWords = new HashMap<String, String>();
        misspeltWords.put("calender", "calendar");
        misspeltWords.put("tomatos", "tomatoes");
        misspeltWords.put("existance", "existence");
        misspeltWords.put("aquaintance", "acquaintance");
        String sentence = "Buy a calender for the year 2013";
        System.out.println("The given sentence is: " + sentence);
        for (String word : sentence.split("\\W+")) {
            if (misspeltWords.containsKey(word)) {
                System.out.println("The correct spelling for " + word
                        + " is: " + misspeltWords.get(word));
            }
        }

        //get the keys:
        Set<String> keys = misspeltWords.keySet();
        System.out.print("Misspelt words in spellchecker are: ");
        System.out.println(keys);


    }
}
