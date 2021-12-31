package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Stores;

@Repository
public interface StoresRepository extends JpaRepository<Stores, Long> {



}