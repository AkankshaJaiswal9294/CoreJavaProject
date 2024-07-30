package com.corejava.variable.instancevariable;

import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;

import java.sql.SQLOutput;
@Log4j2
public class Account {
    //static variable
    public static final String BANK_NAME = "JPMC";
    // instance variable
    public long AccountNo;
    public String AccountName;

    public static void main(String[] args) {
        log.info(Account.BANK_NAME);
        //create object
        Account account = new Account();
        account.AccountName = "AKANKSHA";
        account.AccountNo = 1001l;
        log.info(account.AccountNo+":"+account.AccountName);
    }
}
