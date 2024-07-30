package com.corejava.variable.ListLinked;

import lombok.extern.log4j.Log4j2;
import org.apache.commons.collections4.CollectionUtils;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
@Log4j2
public class StudentDetails {
    public static void main(String[] args) {
        StudentDetails studentDetails = new StudentDetails();
        LinkedList<Student> list = studentDetails.getStudentDetails();
        studentDetails.iterateThruLambda(list);
        studentDetails.iterateThruStream(list);

    }

    public LinkedList<Student> getStudentDetails() {
        Student student1 = new Student();
        student1.setStudentId(1);
        student1.setStudentName("AJ");
        Student student2 = new Student();
        student2.setStudentId(2);
        student2.setStudentName("Vivek");
        LinkedList<Student> list = new LinkedList<>();
        list.add(student1);
        list.add(student2);
        return  list;
    }

    public void iterateThruLambda(LinkedList<Student> list) {
        if(CollectionUtils.isNotEmpty(list)) {
            list.forEach(student -> log.info("Id:{}, Name:{}" ,student.getStudentId(),student.getStudentName()));
        }
    }

    public void iterateThruStream(LinkedList<Student> list) {
        if(CollectionUtils.isNotEmpty(list)) {
            list.stream().filter(student -> "AJ".equals(student.getStudentName())).forEach(student -> log.info("ID:{}, NAME:{}",student.getStudentId(),student.getStudentName()));
        }
    }
}
