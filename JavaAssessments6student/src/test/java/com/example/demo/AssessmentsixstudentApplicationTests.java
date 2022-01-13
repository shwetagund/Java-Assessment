package com.example.demo;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.controller.StudentController;
import com.example.demo.entity.Student;

@SpringBootTest
class AssessmentsixstudentApplicationTests {

	@Autowired
	private StudentController mycontrol;
	
	@Test
	void contextLoads() {
	}

	@Test
	public void testdeleteCall() {
	Student st = new Student();
	assertEquals("Student Deleted", mycontrol.deleteStudent(st));
	}
}
