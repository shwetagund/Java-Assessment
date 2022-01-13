package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.controller.repo.StudentRepository;
import com.example.demo.entity.Student;

@RestController
public class StudentController {

	@Autowired
	private StudentRepository studRepo;

	@PostMapping("/student-name")
	public Student createStudent(@RequestBody Student stu) {
		return studRepo.save(stu);
	}

	@PutMapping("/create")
	public Student updateStudnet(@RequestBody Student stu) {
		return studRepo.save(stu);
	}

	@DeleteMapping("/delete")
	public String deleteStudent(@RequestBody Student stu) {
		studRepo.delete(stu);
		return "Country Deleted";
	}

	@GetMapping("/get-allstudent")
	public List<Student> getStudent() {
		return studRepo.findAll();
	}

}
