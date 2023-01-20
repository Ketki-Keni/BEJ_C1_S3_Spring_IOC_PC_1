/*
 * Author : Ketki Keni
 * Date : 20-01-2023
 * Created with : IntelliJ IDEA Community Edition
 */

package com.niit.bejp;

import org.springframework.context.annotation.Bean;

public class AppConfig {
    @Bean("employee")
    public Employee getEmployeeDetails(){
        Employee employee = new Employee();
        employee.setEmployeeId(101);
        employee.setEmployeeName("James");
        return employee;
    }

    @Bean
    public Department getdepartment(){
        return new Department(02,"Sales");
    }
}
