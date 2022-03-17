package com.zemoso.aopdemo.dao;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainDemoApp {

    public static void main(String arg[]){
        //read the spring config class
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(DemoConfig.class);

        // get the bean from spring
        AccountDAO accountDAO = context.getBean("accountDAO",AccountDAO.class);

        MembershipDAO membershipDAO = context.getBean("membershipDAO",MembershipDAO.class);

        //call the buisness method
        accountDAO.addAccount();
        membershipDAO.addAccount();

        //close the context
        context.close();
    }

}
