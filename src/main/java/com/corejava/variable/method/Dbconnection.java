package com.corejava.variable.method;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Dbconnection {
//    Static method
    public static void getConnection() {
        log.info("static method for DB connection");
    }

    public static String getNewConnection() {
        String connection = "New Db Connection";
        return connection;
    }

    public static void main(String[] args) {
        Dbconnection.getConnection();
        String connection = Dbconnection.getNewConnection();
        log.info(connection);
    }
}
