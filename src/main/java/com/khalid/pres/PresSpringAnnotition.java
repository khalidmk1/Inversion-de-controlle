package com.khalid.pres;

import com.khalid.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresSpringAnnotition {

    public static void main(String[] args) {
        // Create a new instance of the Spring container using the AnnotationConfigApplicationContext is the most use

        ApplicationContext context = new AnnotationConfigApplicationContext("com.khalid");
        IMetier metier = context.getBean(IMetier.class);
        System.out.println("Result = " + metier.calcul());
    }
}
