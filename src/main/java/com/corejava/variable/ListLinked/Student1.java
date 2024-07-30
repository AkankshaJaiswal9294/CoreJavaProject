package com.corejava.variable.ListLinked;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Student1 implements Comparable<Student1> {
    private int studentId1;
    private String studentName1;

    @Override
    public int compareTo(Student1 employee) {
        return this.getStudentId1()-employee.getStudentId1();
    }
}
