package com.corejava.variable.CollectionEx;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Getter
@Setter
@ToString
public class Employee {
    private static final Logger log = LogManager.getLogger(Employee.class);
    private int empId;
    private String empName;

}
