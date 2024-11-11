package com.vladproduction.c02_pretest.cover_questions.task10;

public class TestSwitch {
    public static void main(String []args) {
        String [] cards = { "Club", "spade", " diamond ", "hearts" };
        for(String card : cards) {
            switch(card) {
                case "Club" : System.out.print(" club "); break;
                case "Spade" : System.out.print(" spade "); break;
                case "diamond" : System.out.print(" diamond "); break;
                case "heart" : System.out.print(" heart "); break;
                default: System.out.print(" none ");
            }
        }
    }
    //output:
    // club  none  none  none
}

/*Which one of the following options shows the output of this program?
a) none none none none
+++b) club none none none
c) club spade none none
d) club spade diamond none
e) club spade diamond heart*/
