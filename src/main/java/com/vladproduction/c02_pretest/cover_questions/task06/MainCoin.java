package com.vladproduction.c02_pretest.cover_questions.task06;

public class MainCoin {
    public static void main(String[] args) {
        Side firstAttempt = new HeadSideImpl();
        TailSideImpl secondAttempt = new TailSideImpl();

        //overload(firstAttempt);             // overload(Side side)
        //overload((Object) firstAttempt);    // overload(Object side)
        //overload(secondAttempt);            // overload(TailSideImpl side)
        //overload((Side) secondAttempt);     // overload(Side side)

        //output:
        //Side Object Tail Side

    }

    public static void overload(HeadSideImpl side){
        System.out.print(side.getSide());
    }

    //printing Tail
    public static void overload(TailSideImpl side){
        System.out.print(side.getSide());
    }

    public static void overload(Side side){
        System.out.print("Side ");
    }

    public static void overload(Object side){
        System.out.print("Object ");
    }

}

/*What is the output of this program when executed?
a) Head Head Tail Tail
+++b) Side Object Tail Side
c) Head Object Tail Side
d) Side Head Tail Side*/
