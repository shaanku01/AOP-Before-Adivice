package com.zemoso.aopdemo.dao;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {
    //Advices


    @Before("execution( *  com.zemoso.aopdemo.dao.MembershipDAO.add*())")
    public void beforeAddAccountAdvice(){
        System.out.println(" \n\n\n======> Executing advice on addAccount()");
    }

}
