package com.khalid.pres;

import com.khalid.dao.DaoImpl;
import com.khalid.metier.MetierImpl;

public class PresStatique {

    public static void main(String[] args) {
        DaoImpl dao = new DaoImpl();
        MetierImpl metier = new MetierImpl(dao);
        double result = metier.calcul();
        System.out.println("Result: " + result);
    }
    
}
