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


import com.example.demo.entity.Stores;

import com.example.demo.service.StoresServices;

@RestController
@RequestMapping("/stores")
public class StoresController {
	@Autowired
	private  StoresServices storeServ;

	@PostMapping("/create")
	public Stores createCall(@RequestBody Stores sf) {
		return storeServ.create(sf);
	}

	@PutMapping("/update")
	public Stores updateCall(@RequestBody Stores sf) {
		return storeServ.updateCall(sf);
	}

	@DeleteMapping("/delete")
	public String deleteCall(@RequestBody Stores sf) {
		storeServ.deleteCall(sf);
		return "Deleted";
	}

	@GetMapping("/get-allData")
	public List<Stores> getCall() {
		return storeServ.getCall();
	}
}
