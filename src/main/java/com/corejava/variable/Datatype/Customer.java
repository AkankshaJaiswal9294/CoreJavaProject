package com.corejava.variable.Datatype;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Customer {
    private int customerId;
    private String customerName;
    private Account account;

    public Customer(int id, String name, int id2, String name2 ) {
        this.customerId = id;
        this.customerName = name;
        this.account = new Account(id2,name2);
    }

    public void printCustomerDetails() {
        log.info("Customer id :"+customerId+"Customer name :"+customerName);
        account.printAccountDetails();

    }
}