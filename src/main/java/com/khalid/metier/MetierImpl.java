package com.khalid.metier;

import com.khalid.dao.IDao;

public class MetierImpl implements IMetier {

    private IDao dao;

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    public MetierImpl() {
      
    }

    @Override
    public double calcul() {
        System.out.println("Getting calc form Metier...");
        double data = dao.getData();
        double result = data * 23;
        return result;
    }
    
    
}
