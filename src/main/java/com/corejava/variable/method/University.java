package com.corejava.variable.method;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class University {
//    Static var
    public static final String UNIVERSITY_NAME = "SBU";

//    Instance var
    public int UniversityId;
    public String DepartmentName;

//    Constructor
    public University() {
        this.UniversityId = 1010;
        this.DepartmentName = "Computer Science";
    }

    public  University(int id, String name) {
        this.UniversityId = id;
        this.DepartmentName = name;
    }

//    Static method
    public static void getData() {
        log.info("Get data for University");
    }

    public static String getDetails() {
        String DepartmentDetails = "These are department details";
        return DepartmentDetails;
    }

//  Instance method
    public int getDepartmentCount(int id1,int id2) {
        int Count = id1 + id2;
        return Count ;
    }

    public static void main(String[] args) {
        log.info("Static var "+University.UNIVERSITY_NAME);

        University university = new University();
        log.info(university.UniversityId+";"+university.DepartmentName);

        University university1 = new University(2020,"EEE");
        log.info(university1.UniversityId+";"+university1.DepartmentName);

        University.getData();
        String DepartmentDetails = getDetails();
        log.info(DepartmentDetails);

//        University university2 = new University();
        int count = university1.getDepartmentCount(10,12);
        log.info("this is dept count"+count);
    }
}
