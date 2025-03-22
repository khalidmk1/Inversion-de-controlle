package com.khalid.pres;

import java.io.File;
import java.util.Scanner;
import com.khalid.dao.IDao;
import com.khalid.metier.IMetier;

public class Presdynamique {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(new File("config.txt"));
        String daoClassName = scanner.nextLine();
        Class<?> daoClass = Class.forName(daoClassName);
        IDao dao = (IDao) daoClass.newInstance();


        String metierClassName = scanner.nextLine();
        Class<?> metierClass = Class.forName(metierClassName);
        IMetier metier = (IMetier) metierClass.getConstructor(IDao.class).newInstance(dao);
        System.out.println("Result = " + metier.calcul());
    }
    
}