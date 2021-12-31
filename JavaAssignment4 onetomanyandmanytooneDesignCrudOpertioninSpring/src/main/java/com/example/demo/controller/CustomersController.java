package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Customers;
import com.example.demo.service.CustomerServices;


@RestController
@RequestMapping("/Customer")
public class CustomersController {
	@Autowired
	public CustomerServices custServ;

	@PostMapping("/create")
	public Customers createCall(@RequestBody Customers cf) {
		return custServ.create(cf);
	}

	@PutMapping("/update")
	public Customers updateCall(@RequestBody Customers cf) {
		return custServ.updateCall(cf);
	}

	@DeleteMapping("/delete")
	public String deleteCall(@RequestBody Customers cf) {
		custServ.deleteCall(cf);
		return "Deleted";
	}

	@GetMapping("/get-allData")
	private List<Customers> getCall() {
		return custServ.getCall();
	}
}
