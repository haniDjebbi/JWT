package com.authentication.jwtExemple.Employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import com.authentication.jwtExemple.Employee.model.Employee;
import com.authentication.jwtExemple.Employee.service.EmployeeService;

@RestController
@CrossOrigin
@RequestMapping(value="/employees")
public class EmployeeController {

	@Autowired 
	EmployeeService employeeService ;
	
	
	@GetMapping
	@PreAuthorize("hasRole('MODERATOR')")
	public List<Employee> getAll() {
		return employeeService.findAll() ;
	}
}
