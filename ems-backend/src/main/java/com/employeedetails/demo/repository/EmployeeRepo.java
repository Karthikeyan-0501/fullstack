package com.employeedetails.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employeedetails.demo.model.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Long>{
}
