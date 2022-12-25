package com.example.employeemanagement.service;

import com.example.employeemanagement.Entity.EmployeeEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    List<EmployeeEntity> findAllEmployee();

    Optional<EmployeeEntity>  findById(Long id);

    EmployeeEntity saveEmployee(EmployeeEntity employeeEntity);
    EmployeeEntity updateEmployee(EmployeeEntity employeeEntity);

    void deteleEmployee(Long id );

}
