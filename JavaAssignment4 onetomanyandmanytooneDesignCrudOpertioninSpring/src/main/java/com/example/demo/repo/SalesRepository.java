package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.SalesFact;

@Repository
public interface SalesRepository extends JpaRepository<SalesFact, Long> {



}
