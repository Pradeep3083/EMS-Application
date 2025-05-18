package com.example.EMS.service;

import com.example.EMS.model.Employee;

import java.util.List;


public interface EmployeeService {
    List<Employee> getAllEmployee();
    void save(Employee employee);
    Employee getById(Long id);
    void deleteById(Long id);
}
