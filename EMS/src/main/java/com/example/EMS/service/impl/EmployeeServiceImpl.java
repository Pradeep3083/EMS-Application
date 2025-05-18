package com.example.EMS.service.impl;

import com.example.EMS.model.Employee;
import com.example.EMS.repository.EmployeeRepository;
import com.example.EMS.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    @Override
    public void save(Employee employee) {
        if (Objects.nonNull(employee)) {
            employeeRepository.save(employee);
        }
    }

    @Override
    public Employee getById(Long id) {
        if (Objects.nonNull(id)) {
            Optional<Employee> optionalEmployee = employeeRepository.findById(id);
            if (optionalEmployee.isPresent()) {
                return optionalEmployee.get();
            } else {
                throw new RuntimeException("Employee not found with id: " + id);
            }
        }
        return null;
    }

    @Override
    public void deleteById(Long id) {
        if (Objects.nonNull(id)) {
            employeeRepository.deleteById(id);
        }
    }
}
