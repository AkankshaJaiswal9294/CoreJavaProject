package com.corejava.variable.Datatype;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Student {
    private int studentId;
    private String studentName;
    private Marks marks;

    public Student(int id, String name, int marks1, float marks2) {
        this.studentId = id;
        this.studentName = name;
        this.marks = new Marks(marks1, marks2);
    }

    public void printStudentDetails() {
        log.info("Student id :" + studentId + "Student name :" + studentName);
        marks.printMarksDetails();
    }
}
