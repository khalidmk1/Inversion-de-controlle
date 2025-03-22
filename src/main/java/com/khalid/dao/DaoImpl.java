package com.khalid.dao;


import org.springframework.stereotype.Repository;

@Repository("classDao")
public class DaoImpl implements IDao {
    @Override
    public double getData() {
        double data = 5;
        return data;
    }
}
