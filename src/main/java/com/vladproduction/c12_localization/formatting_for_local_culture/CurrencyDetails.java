package com.vladproduction.c12_localization.formatting_for_local_culture;

import java.util.Currency;
import java.util.Locale;

public class CurrencyDetails {
    public static void main(String []args) {
        Locale locale = Locale.getDefault();
        Currency currencyInstance = Currency.getInstance(locale);
        System.out.println(" The currency code for locale " + locale
                + " is: " + currencyInstance.getCurrencyCode()
                + " \n The currency symbol is " + currencyInstance.getSymbol()
                + " \n The currency name is " + currencyInstance.getDisplayName());
    }
}
