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
import com.example.demo.entity.Dates;
import com.example.demo.service.DatesServices;


@RestController
@RequestMapping("/dates")
public class DatesController {
	@Autowired
	private DatesServices dateServ;

	@PostMapping("/create")
	public Dates createCall(@RequestBody Dates df) {
		return dateServ.create(df);
	}

	@PutMapping("/update")
	public Dates updateCall(@RequestBody Dates df) {
		return dateServ.updateCall(df);
	}

	@DeleteMapping("/delete")
	public String deleteCall(@RequestBody Dates df) {
		dateServ.deleteCall(df);
		return "Deleted";
	}

	@GetMapping("/get-allData")
	public List<Dates> getCall() {
		return dateServ.getCall();
	}
}
