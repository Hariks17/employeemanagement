package com.thehariks.employeemanagement.dao;

import com.thehariks.employeemanagement.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDAO extends JpaRepository<Employee,Integer>{
}