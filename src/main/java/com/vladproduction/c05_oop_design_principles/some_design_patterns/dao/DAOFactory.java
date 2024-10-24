package com.vladproduction.c05_oop_design_principles.some_design_patterns.dao;

public class DAOFactory {

    public static CircleDAO getCircleDAO(String sourceType) {
        // This is a simple example, so we have listed only "RDBMS" as the only source type
        // In a real-world application, you can provide more source types
        switch(sourceType){
            case "RDBMS":
                return new RDBMSDAO();
        }
        return null;
    }

}
