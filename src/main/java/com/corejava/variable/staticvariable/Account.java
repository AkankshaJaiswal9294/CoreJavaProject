package com.corejava.variable.staticvariable;

import com.sun.jdi.PathSearchingVirtualMachine;

public class Account {
    public static final String BANK_NAME = "JPMC";

    public static void main(String[] args) {
        System.out.println(Account.BANK_NAME);
    }
}
