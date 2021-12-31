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

import com.example.demo.entity.SalesFact;
import com.example.demo.service.SalesServices;

@RestController
@RequestMapping("/sales")
public class SalesController {
	@Autowired
	private SalesServices sfServ;

	@PostMapping("/create")
	public SalesFact createCall(@RequestBody SalesFact sf) {
		return sfServ.create(sf);
	}

	@PutMapping("/update")
	public SalesFact updateCall(@RequestBody SalesFact sf) {
		return sfServ.updateCall(sf);
	}

	@DeleteMapping("/delete")
	public String deleteCall(@RequestBody SalesFact sf) {
		sfServ.deleteCall(sf);
		return "Deleted";
	}

	@GetMapping("/get-allData")
	public List<SalesFact> getCall() {
		return sfServ.getCall();
	}
}
