package com.example.demo.controller;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Employee;

@RestController
public class AddressController {
	private static final Logger LOG = Logger.getLogger(AddressController.class.getName());
	
 	@GetMapping("/address")
	public String address() {
		LOG.log(Level.INFO,"Address of custome");
		return "welcome customer";
	}
 	
 	@GetMapping("/employee")
 	public  Employee getAlldata() {
 		Employee emp=new Employee();
 		emp.setEmpName("shweta");
 		emp.setEmpAddress("kolhapur");
 		return emp;
 		
 	}

}
