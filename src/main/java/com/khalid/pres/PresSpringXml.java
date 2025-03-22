package com.khalid.pres;

import com.khalid.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresSpringXml {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        IMetier metier = (IMetier)context.getBean("classMetier");
        System.out.println("Result = " + metier.calcul());

    }
}
