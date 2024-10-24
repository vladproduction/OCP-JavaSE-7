package com.vladproduction.c05_oop_design_principles.some_design_patterns.dao;

public interface CircleDAO {

    void insertCircle(CircleTransfer circle);
    CircleTransfer findCircle(int id);
    void deleteCircle(int id);


}
