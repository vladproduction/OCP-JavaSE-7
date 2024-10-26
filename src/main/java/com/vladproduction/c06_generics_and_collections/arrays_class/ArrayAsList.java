package com.vladproduction.c06_generics_and_collections.arrays_class;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayAsList {
    public static void main(String []args) {

        Double [] weeklyTemperature = {31.1, 30.0, 32.5, 34.9, 33.7, 27.8};
        List<Double> temperatures = Arrays.asList(weeklyTemperature);
        System.out.println("6 days: " + temperatures);
        System.out.println("Maximum temperature recorded was: " +
                Collections.max(temperatures));
        System.out.println("Minimum recorded was: " + Collections.min(temperatures));

        //if needed to add more elements to the list:
        List<Double> temperatureList = new ArrayList<Double>(Arrays.asList(weeklyTemperature));
        temperatureList.add(39.3);
        System.out.println("The new List (7 days) with an added element is: " + temperatureList);

        //and now we can took max and min again for the updated collection:
        System.out.println("Maximum temperature recorded was: " +
                Collections.max(temperatureList));
        System.out.println("Minimum recorded was: " + Collections.min(temperatureList));
    }
}
