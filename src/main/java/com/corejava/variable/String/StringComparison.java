package com.corejava.variable.String;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class StringComparison {
    public static void main(String[] args) {
    String str1 = "Akanksha";
    String str2 = new String("Akanksha");
    StringComparison stringComparison = new StringComparison();
    boolean result = stringComparison.equalSign(str1, str2);
        log.info("Equalsign :"+result);
    boolean result1 = stringComparison.equalChar(str1,str2);
        log.info("Equalchar :"+result1);
    boolean result2 = stringComparison.compareChar(str1, str2);
        log.info("Comparechar :"+result2);
    }

    public boolean equalSign(String str1, String str2) {
        if (str1 == str2) {
            return true;
        }
        else {
            return  false;
        }
    }

    public boolean equalChar(String str1, String str2) {
        if (str1.equals(str2)) {
            return  true;
        }
        else {
            return  false;
        }
    }

    public boolean compareChar(String str1, String str2) {
        if ((str1.compareTo(str2) == 0)) {
            return true;
        }
        else {
            return  false;
        }
    }
    }
