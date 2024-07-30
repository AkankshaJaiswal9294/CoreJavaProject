package com.corejava.variable.Datatype;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Unboxing {

    public static void main(String[] args) {
        Integer input1 = 100 ;
        int input2 = input1 ;
        Character input3 = 'B' ;
        char input4 = input3 ;
        Float input5 = 1.1f ;
        float input6 = input5 ;
        log.info("unbox Input "+input2+","+input4+","+input6);
    }
}
