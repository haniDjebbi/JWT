package com.authentication.jwtExemple.Employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.authentication.jwtExemple.Employee.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
