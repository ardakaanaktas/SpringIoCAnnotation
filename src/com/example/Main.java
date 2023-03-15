package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/example/applicationContext.xml");

        ICustomerDal customerDal = context.getBean("database",ICustomerDal.class);

        customerDal.add();
    }
}