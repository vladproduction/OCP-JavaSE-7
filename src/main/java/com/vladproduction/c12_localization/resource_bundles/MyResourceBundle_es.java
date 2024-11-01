package com.vladproduction.c12_localization.resource_bundles;

import java.util.ListResourceBundle;

public class MyResourceBundle_es extends ListResourceBundle {

    @Override
    protected Object[][] getContents() {
        return new Object[][] {
                {"greeting", "¡Hola, Mundo!"},
                {"farewell", "¡Adiós!"},
                {"thanks", "¡Gracias!"}
        };
    }
}
