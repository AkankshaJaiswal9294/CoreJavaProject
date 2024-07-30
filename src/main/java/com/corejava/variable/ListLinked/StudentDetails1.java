package com.corejava.variable.ListLinked;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Collections;
import java.util.LinkedList;

public class StudentDetails1 {
    private static final Logger log = LogManager.getLogger(StudentDetails1.class);

    public static void main(String[] args) {
      StudentDetails1 studentDetails1 = new StudentDetails1();
      LinkedList<Student1> list2 = studentDetails1.getStudentDetails1();
        Collections.sort(list2);
        log.info(list2);
        Collections.sort(list2,Collections.reverseOrder());
        log.info(list2);
    }

    public LinkedList<Student1> getStudentDetails1() {
        Student1 student1 = new Student1();
        student1.setStudentId1(2);
        student1.setStudentName1("Vivek");
        Student1 student2 = new Student1();
        student2.setStudentId1(1);
        student2.setStudentName1("Akanksha");
        LinkedList<Student1> list2 = new LinkedList<>();
        list2.add(student1);
        list2.add(student2);
        return list2;
    }

}
