package com.Onetoonespring.one2manyrelationspringproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Onetoonespring.one2manyrelationspringproject.enitity.Phone;
import com.Onetoonespring.one2manyrelationspringproject.repository.PhoneRepository;

@RestController
@RequestMapping("/phone")
public class PhoneController {
    @Autowired
    private PhoneRepository phoneRepository;

    @PostMapping("/")
    public Phone addPhone(@RequestBody Phone phone) {
        return phoneRepository.save(phone);
    }
    @GetMapping("/")
    public List<Phone> listPhone() {
        return phoneRepository.findAll();
    }
    @PutMapping("/")
    public Phone updatePhone(@RequestBody Phone phone) {
        return phoneRepository.save(phone);
    }
}