package com.khalid.metier;

import com.khalid.dao.DaoImpl;
import com.khalid.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("classMetier")
public class MetierImpl implements IMetier {

    //@Autowired
    //@Qualifier("classDao")
    private IDao dao;

    //this is the best use for injectiqn class
    public MetierImpl(@Qualifier("classDaoV2") IDao dao)  {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        System.out.println("Getting calc form Metier...");
        double data = dao.getData();
        double result = data * 23;
        return result;
    }


    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
