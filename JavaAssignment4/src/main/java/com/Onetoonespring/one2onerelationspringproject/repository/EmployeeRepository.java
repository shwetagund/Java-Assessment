package com.Onetoonespring.one2onerelationspringproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Onetoonespring.one2onerelationspringproject.entity.Employee;



@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
