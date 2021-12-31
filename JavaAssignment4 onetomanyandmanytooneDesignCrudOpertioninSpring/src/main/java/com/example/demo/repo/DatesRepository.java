package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Dates;

@Repository
public interface DatesRepository extends JpaRepository<Dates, Long> {



}