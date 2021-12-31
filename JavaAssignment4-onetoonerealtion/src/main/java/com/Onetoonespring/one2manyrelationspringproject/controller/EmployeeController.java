package com.Onetoonespring.one2manyrelationspringproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Onetoonespring.one2manyrelationspringproject.enitity.Employee;
import com.Onetoonespring.one2manyrelationspringproject.repository.EmployeeRepository;



@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	private EmployeeRepository employeeRepository;

	@PostMapping("/")
	public Employee addEmployee(@RequestBody Employee employee ) {
		return employeeRepository.save(employee);
	}
	
	@GetMapping("/")
	public List<Employee> listEmploye(){
		return employeeRepository.findAll();
	}
	@PutMapping("/")
    public Employee updateEmployee(@RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }
}
