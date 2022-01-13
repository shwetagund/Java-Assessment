package com.example.demo.controller;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CustomerController {
	private static final Logger LOG = Logger.getLogger(CustomerController.class.getName());

	@GetMapping("/customer")
	public String address() {
		LOG.log(Level.INFO, "custmore welcome");
		return "welcome customer";
	}
	
	@GetMapping("/employeeseond")
	private String getempdata() {
		RestTemplate restTemp=new RestTemplate();
		String result=restTemp.getForObject("http://localhost:7071/employee",String.class );
	     return result;
	}
}
