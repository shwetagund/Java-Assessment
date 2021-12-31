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

import com.example.demo.entity.Products;

import com.example.demo.service.ProductsServices;


@RestController
@RequestMapping("/products")
public class ProductsController {
	@Autowired
	private ProductsServices productServ;

	@PostMapping("/create")
	public Products createCall(@RequestBody Products pf) {
		return productServ.create(pf);
	}

	@PutMapping("/update")
	public Products updateCall(@RequestBody Products pf) {
		return productServ.updateCall(pf);
	}

	@DeleteMapping("/delete")
	public String deleteCall(@RequestBody Products pf) {
		productServ.deleteCall(pf);
		return "Deleted";
	}

	@GetMapping("/get-allData")
	public List<Products> getCall() {
		return productServ.getCall();
	}
}
