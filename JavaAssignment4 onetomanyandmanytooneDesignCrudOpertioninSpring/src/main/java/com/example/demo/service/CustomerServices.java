package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Customers;
import com.example.demo.repo.CustomersRepository;

@Service
public class CustomerServices {
	@Autowired
	private CustomersRepository custRepo;

	public Customers create(Customers cf) {
// TODO Auto-generated method stub
		return custRepo.save(cf);
	}

	public Customers updateCall(Customers cf) {
// TODO Auto-generated method stub
		return custRepo.save(cf);
	}

	public void deleteCall(Customers cf) {
		custRepo.delete(cf);
	}

	public List<Customers> getCall() {
// TODO Auto-generated method stub
		return custRepo.findAll();
	}

}