package com.vladproduction.c12_localization.question_time;

import java.text.NumberFormat;
import java.text.ParseException;

public class FractionDigits {
    public static void main(String[] args) {
        String[] numbers = {"1.222", "0.456789F"};
        NumberFormat numberFormat = NumberFormat.getInstance();
        numberFormat.setMaximumFractionDigits(2);
        for(String number : numbers) {
            try {
                System.out.println(numberFormat.parse(number));
            }
            catch(ParseException pe) {
                System.out.println("Failed parsing " + number);
            }
        }
    }
}
/*Answer:
1.222
0.456789
(The parse() method reads the values and converts it to Number if it succeeds. So, it does not use the maximum
fraction digits set using setMaximumFractionDigits; however, if it were to use the format() method, which is
meant for printing numbers, it will use this maximum fraction digits limit set.)*/
