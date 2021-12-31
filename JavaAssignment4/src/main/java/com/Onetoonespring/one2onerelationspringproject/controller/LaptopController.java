package com.Onetoonespring.one2onerelationspringproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Onetoonespring.one2onerelationspringproject.entity.Laptop;
import com.Onetoonespring.one2onerelationspringproject.repository.LaptopRepository;

@RestController
@RequestMapping("/laptop")
public class LaptopController {
	@Autowired
	private LaptopRepository laptopRepository;

	@PostMapping("/")
    public Laptop addLaptop(@RequestBody Laptop laptop) {
        return laptopRepository.save(laptop);
    }
    @GetMapping("/")
    public List<Laptop> listLaptop() {
        return laptopRepository.findAll();
    }

}
