package com.Onetoonespring.one2manyrelationspringproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Onetoonespring.one2manyrelationspringproject.enitity.Phone;

@Repository
public interface PhoneRepository extends JpaRepository<Phone, Long>{
 
}