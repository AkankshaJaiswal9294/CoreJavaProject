package com.corejava.variable.Datatype;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Account {
    private static final Logger log = LogManager.getLogger(Account.class);
    private int studentId;
    private String studentName;

    public Account(int id, String name) {
        this.studentId = id;
        this.studentName = name;
    }

    public void printAccountDetails() {
        log.info("Student id :"+studentId+"student name :"+studentName);
    }
}
