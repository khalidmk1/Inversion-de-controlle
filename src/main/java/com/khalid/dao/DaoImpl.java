package com.khalid.dao;

public class DaoImpl implements IDao {
    @Override
    public double getData() {
        System.out.println("Getting data from database...");
        double data = 5;
        return data;
    }
}
