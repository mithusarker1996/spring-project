package com.spring.csvtomysql.config;

import com.spring.csvtomysql.model.Employee;
import org.springframework.batch.item.ItemProcessor;

public class EmployeeItemProcesser implements ItemProcessor<Employee, Employee> {
    @Override
    public Employee process(Employee employee) throws Exception {
        return employee;
    }
}
