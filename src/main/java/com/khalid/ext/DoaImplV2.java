package com.khalid.ext;

import com.khalid.dao.IDao;

public class DoaImpV2 implements IDao {

    @Override
    public double getData() {
        System.out.println("Getting data from database V2 ...");
        double data = 7;
        return data;
    }
}
