package com.thehariks.employeemanagement.services;

import com.thehariks.employeemanagement.model.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> findAll();
    public Employee save(Employee employee);
    public Employee findById(int id);
    void deleteById(int id);

}
