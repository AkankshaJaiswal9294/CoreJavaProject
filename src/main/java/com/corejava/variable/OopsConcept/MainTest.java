package com.corejava.variable.OopsConcept;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class MainTest {
    public static void main(String[] args) {
        AssignmentEncapsulation assignmentEncapsulation = new AssignmentEncapsulation();
        assignmentEncapsulation.setEmployeeName("Akanksha");
        assignmentEncapsulation.setEmployeeId(1111);
        log.info("Employee id :{} , Employee name :{}",assignmentEncapsulation.getEmployeeId(),assignmentEncapsulation.getEmployeeName());

        AssignmentEncapsulation assignmentEncapsulation1 = new AssignmentEncapsulation();
        assignmentEncapsulation1.setMailId("akki@gmail");
        assignmentEncapsulation1.setMobileNumber(123456789);
        log.info("Employee mail :{} , Employee mobile :{}",assignmentEncapsulation1.getMailId(),assignmentEncapsulation1.getMobileNumber());

    }
}
