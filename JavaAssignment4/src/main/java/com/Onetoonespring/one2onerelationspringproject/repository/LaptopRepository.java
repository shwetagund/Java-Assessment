package com.Onetoonespring.one2onerelationspringproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Onetoonespring.one2onerelationspringproject.entity.Laptop;

@Repository
public interface LaptopRepository extends JpaRepository<Laptop, Long> {

}
