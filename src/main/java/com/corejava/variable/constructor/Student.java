package com.corejava.variable.constructor;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Student {
    public static final String UNIVERSITY_NAME = "SRM";
    public int StudentId;
    public String StudentName;

    public Student() {
        this.StudentId = 1001 ;
        this.StudentName = "DEF";
    }

    public Student(int id,String name) {
        this.StudentId = id;
        this.StudentName = name;
    }

    public Student(String name,int id) {
        this.StudentId = id;
        this.StudentName = name;
    }

    public static void main(String[] args) {
        log.info(Student.UNIVERSITY_NAME);

        String Subject = "ENGLISH";
        log.info("Subject"+Subject);

        Student student = new Student();
        log.info(student.StudentId+":"+student.StudentName);

        Student student1 = new Student(1002,"AKKI");
        log.info(student1.StudentId+":"+student1.StudentName);

        Student student2 = new Student(1003,"VIVEK");
        log.info(student2.StudentId+":"+student2.StudentName);
    }
}
