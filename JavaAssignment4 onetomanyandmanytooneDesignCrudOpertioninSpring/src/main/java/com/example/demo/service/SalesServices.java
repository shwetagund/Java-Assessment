package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.SalesFact;
import com.example.demo.repo.SalesRepository;

@Service
public class SalesServices {
	@Autowired
	private SalesRepository sfRepo;

	public SalesFact create(SalesFact sf) {
// TODO Auto-generated method stub
		return sfRepo.save(sf);
	}

	public SalesFact updateCall(SalesFact sf) {
// TODO Auto-generated method stub
		return sfRepo.save(sf);
	}

	public void deleteCall(SalesFact sf) {
		sfRepo.delete(sf);
	}

	public List<SalesFact> getCall() {
// TODO Auto-generated method stub
		return sfRepo.findAll();
	}

}