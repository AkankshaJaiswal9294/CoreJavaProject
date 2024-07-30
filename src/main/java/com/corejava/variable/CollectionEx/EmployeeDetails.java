package com.corejava.variable.CollectionEx;

import lombok.extern.log4j.Log4j2;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.collections4.CollectionUtils;

@Log4j2
public class EmployeeDetails {
    public static void main(String[] args) {
        EmployeeDetails employeeDetails = new EmployeeDetails();
        List<Employee> employees = employeeDetails.getEmployeeDetail();
        employeeDetails.iterateUsingLambda(employees);
        employeeDetails.iterateUsingStream(employees);

    }
    public List<Employee> getEmployeeDetail() {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();
        Employee employee4 = new Employee();
        employee1.setEmpId(1);
        employee1.setEmpName("Akanksha");
        employee2.setEmpId(2);
        employee2.setEmpName("Vivek");
        employee3.setEmpId(3);
        employee3.setEmpName("Roja");
        employee4.setEmpId(4);
        employee4.setEmpName("Anirudh");
        List<Employee> list = new ArrayList<>();
        list.add(employee1);
        list.add(employee2);
        list.add(employee3);
        list.add(employee4);
        return list;

    }

    public void iterateUsingLambda(List<Employee> list) {
        if(CollectionUtils.isNotEmpty(list)) {
            list.forEach(employee -> log.info("EmpId :{} and Emp name :{}", employee.getEmpId(), employee.getEmpName()));
        }
    }

    public void iterateUsingStream(List<Employee> list) {
        if(CollectionUtils.isNotEmpty(list)) {
            list.stream().filter(employee -> "Akanksha".equals(employee.getEmpName())).forEach(employee -> log.info("EmpId :{} and Emp name :{}", employee.getEmpId(), employee.getEmpName()));
        }
    }
}
