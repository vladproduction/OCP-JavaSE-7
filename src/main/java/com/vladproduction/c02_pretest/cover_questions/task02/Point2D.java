package com.vladproduction.c02_pretest.cover_questions.task02;

class Point2D {
    private int x, y;

    public Point2D(int x, int y) {
        x = x;
    }

    public String toString() {
        return "[" + x + ", " + y + "]";
    }

    public static void main(String[] args) {
        Point2D point = new Point2D(10, 20);
        System.out.println(point);
    }

    //output: [0, 0] --> by default int is defined as '0'
    //without this, the instance variables are never set to the provided values, causing them to remain at their default 0 values
    //in constructor needs to add 'this' so we can put some values during creating instance
}

/*
Which one of the following options provides the output of this program when executed?
a) point
b) Point
+++c) [0, 0]
d) [10, 0]
e) [10, 20]*/
