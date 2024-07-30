package com.corejava.variable.ExceptionHandling;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class StringException {
    public static void main(String[] args) {
        String str1 = null;
        String str4 = null;
        StringException stringException = new StringException();
        try {
            stringException.getString2(str4);
        } catch (NullPointerException e) {
            log.info("exception "+e);
        }
        stringException.getString1(str1);
    }

    private String getString1(String str1) {
        String str2 = str1.substring(2);
        log.info("str2:{}", str2);
        return  str2;
    }

    public String getString2(String str4) {
        String str3 = str4.substring(2);
        return str3;
    }
}
