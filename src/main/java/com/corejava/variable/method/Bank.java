package com.corejava.variable.method;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Bank {
//    Static variable
    public static final String BANK_NAME = "JPMC";

    //    Instance variable
    public int AccountId;
    public String AccountName;

    //    Constructor
    public Bank() {
        this.AccountId = 1111;
        this.AccountName = "AKKI";
    }
    public Bank(int id,String name) {
        this.AccountId = id;
        this.AccountName = name;
    }

//  static method
    public static void getConnection() {
        log.info("Static method connection 1");
    }
    public static String getNewConnection() {
        String newconnect = "This is new connection for static method" ;
        return newconnect;
    }

//    instance method
    public long addNum(long inp1, long inp2) {
        long result = inp1 + inp2;
        return result;
    }

    public static void main(String[] args) {
        log.info("static var "+Bank.BANK_NAME);

        Bank bank = new Bank();
        log.info(bank.AccountId+":"+bank.AccountName);

        Bank bank1 = new Bank(2222,"AKANKSHA");
        log.info(bank1.AccountId+":"+bank1.AccountName);

        Bank.getConnection();
        String newconnection = Bank.getNewConnection();
        log.info(newconnection);

//        Bank bank2 = new Bank();
        long response = bank1.addNum(10,20);
        log.info("response is :"+response);

    }
}
