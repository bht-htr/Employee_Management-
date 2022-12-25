package com.example.employeemanagement.service.impl;

import com.example.employeemanagement.Entity.EmployeeEntity;
import com.example.employeemanagement.reponsitory.EmployeeReponsitory;
import com.example.employeemanagement.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeImpl implements EmployeeService {

    private final EmployeeReponsitory employeeReponsitory;

    public EmployeeImpl(EmployeeReponsitory employeeReponsitory) {
        this.employeeReponsitory = employeeReponsitory;
    }

    @Override
    public List<EmployeeEntity> findAllEmployee() {
        return employeeReponsitory.findAll();
    }

    @Override
    public Optional<EmployeeEntity> findById(Long id) {
        return employeeReponsitory.findById(id);
    }

    @Override
    public EmployeeEntity saveEmployee(EmployeeEntity employeeEntity) {
        return employeeReponsitory.save(employeeEntity);
    }

    @Override
    public EmployeeEntity updateEmployee(EmployeeEntity employeeEntity) {
        return employeeReponsitory.save(employeeEntity);
    }

    @Override
    public void deteleEmployee(Long id) {
        employeeReponsitory.deleteById(id);
    }
}
