package com.example.demo.controller.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Course;


@Repository
public interface CourseseRepository extends JpaRepository<Course,Long> {

}
