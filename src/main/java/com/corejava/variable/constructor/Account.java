package com.corejava.variable.constructor;

import lombok.extern.log4j.Log4j2;

import java.sql.SQLOutput;
@Log4j2
public class Account {
//    Static variable
    public static final String BANK_NAME = "JPMC" ;

//    Instance variable
    public int AccountId;
    public String AccountName;

//    Default constructor
    public Account() {
        this.AccountId = 1001;
        this.AccountName = "ABC";
    }

//    Parameterized constructor
    public Account(int id, String name) {
        this.AccountId = id;
        this.AccountName = name;
    }

//    Constructor overloading
    public Account(String name, int id) {
        this.AccountName = name;
        this.AccountId = id;
    }

    public static void main(String[] args) {
        log.info(Account.BANK_NAME);

        Account account = new Account();
        log.info(account.AccountId+ ":"+account.AccountName);

        Account account1 = new Account(1002,"AKANKSHA");
        log.info(account1.AccountId+":"+account1.AccountName);

        Account account2 = new Account("JAISWAL",1003);
        log.info(account2.AccountId+":"+account2.AccountName);
    }
}
