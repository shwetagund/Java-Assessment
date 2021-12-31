package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Dates;
import com.example.demo.repo.DatesRepository;


@Service
public class DatesServices {
	@Autowired
	private DatesRepository dateRepo;

	public Dates create(Dates df) {
// TODO Auto-generated method stub
		return dateRepo.save(df);
	}

	public Dates updateCall(Dates df) {
// TODO Auto-generated method stub
		return dateRepo.save(df);
	}

	public void deleteCall(Dates df) {
		dateRepo.delete(df);
	}

	public List<Dates> getCall() {
// TODO Auto-generated method stub
		return dateRepo.findAll();
	}

}
