package com.vladproduction.c02_pretest.cover_questions.task12;

public class CardsEnumTest {
    public static void main(String[] args) {
        /* TRAVERSE */
        for (Cards card : Cards.values()) {
            System.out.print(card + " ");
        }
        //output:
        //CLUB SPADE DIAMOND HEARTS
    }
}

/*Which one of the following will you replace in place of the comment *//* TRAVERSE *//* to traverse the Cards
enumeration and print the output “CLUB SPADE DIAMOND HEARTS”?*/
/*+++a) for(Cards card : Cards.values())
        System.out.print(card + " ");*/
/*b) for(Cards card : Cards.iterator())
        System.out.print(card + " ");*/
/*c) for(Cards card : Cards.enums())
        System.out.print(card + " ");*/
/*d) for(Cards card : Cards.items())
        System.out.print(card + " ");*/
/*e) There is no way to print the string names of this enumeration. The toString() method of enumeration returns the
ordinal value of the enumeration, which is equivalent to calling card.ordinal().toString();*/
