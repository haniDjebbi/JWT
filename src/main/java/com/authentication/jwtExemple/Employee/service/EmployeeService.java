package com.authentication.jwtExemple.Employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.authentication.jwtExemple.Employee.model.Employee;
import com.authentication.jwtExemple.Employee.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired 
	EmployeeRepository employeeRepository ;
	
	public List<Employee> findAll(){
		return employeeRepository.findAll() ;
	}

}
