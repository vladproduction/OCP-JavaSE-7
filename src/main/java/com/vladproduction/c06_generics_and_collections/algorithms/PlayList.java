package com.vladproduction.c06_generics_and_collections.algorithms;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Assume that you are creating a playlist of your favorite Michael Jackson songs. There are many things that you
 * can do with a playlist: you can sort, shuffle, search, reverse, or replay songs.
 * <p>
 * program demonstrates some of the useful methods in Collections class
 */
public class PlayList {
    public static void main(String[] args) {
        // let's create a list of some Michael Jackson's songs
        List<String> playList = new LinkedList<>();
        playList.add("Rock With You - 1979");
        playList.add("Billie Jean - 1983");
        playList.add("Man In the Mirror - 1988");
        playList.add("Black Or White - 1991");

        System.out.println("The original playlist of MJ's songs");
        System.out.println(playList);

        System.out.println("\nThe reversed playlist");
        Collections.reverse(playList);
        System.out.println(playList);
        System.out.println("\nNow after shuffling the playlist");
        Collections.shuffle(playList);
        System.out.println(playList);
        System.out.println("\nSort the songs by their names ");
        Collections.sort(playList);
        System.out.println(playList);
        System.out.println("\nIs my most favourite song Black Or White - 1991" +
                " present in the list?");
        String backOrWhiteSong = "Black Or White - 1991";
        int index = Collections.binarySearch(playList, backOrWhiteSong);
        if (index >= 0)
            System.out.printf("Yes, its the number %d song \n", (index + 1)); //because index starts from '0'
        else
            System.out.printf("No, its not there in the playlist \n");

        System.out.println("\nLet me forward by two songs (rotate the list) ");
        Collections.rotate(playList, 2); // takes two arguments, the List and an int value,
                                                 // to tell how many positions you need to move the values
        System.out.println(playList);
    }
}
