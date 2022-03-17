package com.zemoso.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

    public void addAccount(){
        System.out.println(getClass() + " :Doing MY DB WORK: Adding an account ");
    }

}
