package com.corejava.variable.constructor;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class University {
    //    Static variable
    public static final String DEPT_NAME = "EEE" ;

    //    Instance variable
    public int DeptId;
    public String DeptHead;

    //    Default constructor
    public University() {
        this.DeptId = 1001;
        this.DeptHead = "AKANKSHA JAISWAL";
    }

    //    Parameterized constructor
    public University(int id, String name) {
        this.DeptId = id;
        this.DeptHead = name;
    }

    //    Constructor overloading
    public University(String name, int id) {
        this.DeptHead = name;
        this.DeptId = id;
    }

    public static void main(String[] args) {
        log.info(University.DEPT_NAME);

        String CityBranch = "BENGALURU";
        log.info("CITY"+CityBranch);

        University university = new University();
        log.info(university.DeptId+ ":"+university.DeptHead);

        University university1 = new University(1005,"VIVEK JAISWAL");
        log.info(university1.DeptId+ ":"+university1.DeptHead);

        University university2 = new University("AKKI",1006);
        log.info(university2.DeptId+ ":"+university2.DeptHead);
    }
}
