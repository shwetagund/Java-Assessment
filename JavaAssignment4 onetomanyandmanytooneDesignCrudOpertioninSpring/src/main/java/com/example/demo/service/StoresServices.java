package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Stores;

import com.example.demo.repo.StoresRepository;

@Service
public class StoresServices {
	@Autowired
	private StoresRepository storeRepo;

	public Stores create(Stores sf) {
// TODO Auto-generated method stub
		return storeRepo.save(sf);
	}

	public Stores updateCall(Stores sf) {
// TODO Auto-generated method stub
		return storeRepo.save(sf);
	}

	public void deleteCall(Stores sf) {
		storeRepo.delete(sf);
	}

	public List<Stores> getCall() {
// TODO Auto-generated method stub
		return storeRepo.findAll();
	}

}
