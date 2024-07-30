package com.corejava.variable.Datatype;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class getAddition {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.addition(20,25);
        log.info(result);
        int result1 = calculator.addition(100,200);
        log.info(result1);
    }

}
