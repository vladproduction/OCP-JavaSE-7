package com.vladproduction.c07_string_processing.formating;

/**
 * Suppose that you want to print a table of soccer players along
 * with their names, played matches, scored goals, and goals per match information. However, there are a
 * few constraints:
 * •	 You want to print the name of players to the left (left aligned).
 * •	 You want to specify at least 15 characters for the name of the players.
 * •	 You want to print each column at a distance of a tab-stop.
 * •	 You want to specify only one precision point in goals per match info.
 * */
public class FormattedTable {
    static void line() {
        System.out.
                println("-----------------------------------------------------------------");
    }
    static void printHeader() {
        System.out.printf("%-15s \t %s \t %s \t %s \n",
                "Player", "Matches", "Goals", "Goals per match");
    }
    static void printRow(String player, int matches, int goals) {
        System.out.printf("%-15s \t %5d \t\t %d \t\t %.1f \n",
                player, matches, goals, ((float)goals/(float)matches));
    }
    public static void main(String[] str) {
        FormattedTable.line();
        FormattedTable.printHeader();
        FormattedTable.line();
        FormattedTable.printRow("Totti", 100, 122);
        FormattedTable.printRow("Del Piero", 80, 100);
        FormattedTable.printRow("Baggio", 150, 180);
        FormattedTable.line();
    }
}

/*Let’s analyze the format string specified in the printRow() method. The first part of the format string is "%-15s".
Here, the expression starts with %, which indicates the start of a format-specifier string. The next symbol is '-', which
is used to make the string left aligned. The number "15" specifies the width of the string and finally data type specifier
of "s" indicates the input data type as String. The next format specifier string is "%5d", which signifies it expects
an integer that will be displayed in the minimum 5 digits. The last format specifier string is "%.1f", which expects a
floating point number that will be displayed with one precision digit. All format specifier strings are separated with
one or more "\t"s (tab stops) to make space between the columns.*/
