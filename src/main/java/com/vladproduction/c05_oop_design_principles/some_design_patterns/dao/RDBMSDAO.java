package com.vladproduction.c05_oop_design_principles.some_design_patterns.dao;

public class RDBMSDAO implements CircleDAO {
    @Override
    public void insertCircle(CircleTransfer circle) {
        // insertCircle implementation
        System.out.println("insertCircle implementation");
    }
    @Override
    public CircleTransfer findCircle(int id) {
        // findCircle implementation
        return null;
    }
    @Override
    public void deleteCircle(int id) {
        // deleteCircle implementation
    }
}
