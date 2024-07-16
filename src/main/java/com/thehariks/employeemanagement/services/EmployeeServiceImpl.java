package com.thehariks.employeemanagement.services;

import com.thehariks.employeemanagement.dao.EmployeeDAO;
import com.thehariks.employeemanagement.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    EmployeeDAO employeeDAO;


    @Autowired
    public EmployeeServiceImpl(EmployeeDAO employeeDAO){
        this.employeeDAO = employeeDAO;
    }


    @Override
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }

    @Override
    public Employee save(Employee employee) {
        return employeeDAO.save(employee);
    }

    @Override
    public Employee findById(int id) {

        Optional<Employee> result = employeeDAO.findById(id);
        Employee employee = null;

        if(result.isPresent()){
            employee = result.get();
        }
        else {
            throw new RuntimeException("The Employee id doesnt exist "+id );

        }

        return employee;
    }

    @Override
    public void deleteById(int id) {
        employeeDAO.deleteById(id);

    }

}
