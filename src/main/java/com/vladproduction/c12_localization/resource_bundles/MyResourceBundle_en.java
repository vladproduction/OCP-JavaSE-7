package com.vladproduction.c12_localization.resource_bundles;

import java.util.ListResourceBundle;

public class MyResourceBundle_en extends ListResourceBundle {

    @Override
    protected Object[][] getContents() {
        return new Object[][] {
                {"greeting", "Hello World!"},
                {"farewell", "Goodbye!"},
                {"thanks", "Thank You!"}
        };
    }
}
