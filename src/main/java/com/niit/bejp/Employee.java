/*
 * Author : Ketki Keni
 * Date : 20-01-2023
 * Created with : IntelliJ IDEA Community Edition
 */

package com.niit.bejp;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

    private int employeeId;
    private String employeeName;
    @Autowired
    private Department department;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Department getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", department=" + department +
                '}';
    }
}
