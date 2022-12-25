package com.example.employeemanagement.reponsitory;


import com.example.employeemanagement.Entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeReponsitory extends JpaRepository<EmployeeEntity, Long> {
}
