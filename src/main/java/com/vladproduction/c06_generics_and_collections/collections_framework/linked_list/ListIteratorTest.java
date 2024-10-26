package com.vladproduction.c06_generics_and_collections.collections_framework.linked_list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorTest {
    public static void main(String[] args) {
        String palindromeString = "wabcbaw";
        List<Character> characterList = new LinkedList<>();
        for (char c : palindromeString.toCharArray()) {
            characterList.add(c);
        }
        System.out.println("Input string: " + palindromeString);
        ListIterator<Character> iterator = characterList.listIterator();
        ListIterator<Character> reversedIterator = characterList.listIterator(characterList.size());
        boolean isPalindrome = true;

        while (reversedIterator.hasPrevious() && iterator.hasNext()) {
            if(iterator.next() != reversedIterator.previous()){
                isPalindrome = false;
                break;
            }
        }
        
        if(isPalindrome){
            System.out.println("Input string: palindrome");
        }
        else {
            System.out.println("Input string: not palindrome");
        }
    }
}
