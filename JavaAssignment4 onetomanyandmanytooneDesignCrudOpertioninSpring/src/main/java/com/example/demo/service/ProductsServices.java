package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Products;
import com.example.demo.repo.ProductsRepository;


@Service
public class ProductsServices {
	@Autowired
	private ProductsRepository productRepo;

	public Products create(Products pf) {
// TODO Auto-generated method stub
		return productRepo.save(pf);
	}

	public Products updateCall(Products pf) {
// TODO Auto-generated method stub
		return productRepo.save(pf);
	}

	public void deleteCall(Products pf) {
		productRepo.delete(pf);
	}

	public List<Products> getCall() {
// TODO Auto-generated method stub
		return productRepo.findAll();
	}

}