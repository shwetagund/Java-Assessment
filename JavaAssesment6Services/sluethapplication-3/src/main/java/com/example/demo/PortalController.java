package com.example.demo;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;



@RestController
public class PortalController {
	private static final Logger LOG = Logger.getLogger(PortalController.class.getName());

	@GetMapping("/customer")
	public String address() {
		LOG.log(Level.INFO, "portal welcome");
		return "welcome all customer";
	}
	
	@GetMapping("/employeethird")
	private String getempdata() {
		RestTemplate restTemp=new RestTemplate();
		String result=restTemp.getForObject("http://localhost:7072/employeeseond",String.class );
	     return result;
	}
}
