package com.corejava.variable.Datatype;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class AutoBoxing {

    public static void main(String[] args) {
        int input1 = 60;
        Integer input2 = input1;
        char input3 = 'A';
        Character input4 = input3;
        float input5 = 1.1f ;
        Float input6 = input5 ;
        log.info("Autobox Input "+input2+","+input4+","+input6);
    }
}
