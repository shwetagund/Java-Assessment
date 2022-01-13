package com.example.demo.entity;



import java.io.Serializable;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import io.vavr.collection.Set;
@Entity
public class Student implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long studentRollNo;
	private Long standaredId;


	@OneToOne(cascade = CascadeType.ALL)
	private Set<Course>course;

	@OneToOne(cascade = CascadeType.ALL)
	private Set<Teachers>techer;

	public Long getStudentRollNo() {
		return studentRollNo;
	}

	public void setStudentRollNo(Long studentRollNo) {
		this.studentRollNo = studentRollNo;
	}

	public Long getStandaredId() {
		return standaredId;
	}

	public void setStandaredId(Long standaredId) {
		this.standaredId = standaredId;
	}

	public Set<Course> getCourse() {
		return course;
	}

	public void setCourse(Set<Course> course) {
		this.course = course;
	}

	public Set<Teachers> getTecher() {
		return techer;
	}

	public void setTecher(Set<Teachers> techer) {
		this.techer = techer;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(course, standaredId, studentRollNo, techer);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(course, other.course) && Objects.equals(standaredId, other.standaredId)
				&& Objects.equals(studentRollNo, other.studentRollNo) && Objects.equals(techer, other.techer);
	}

	@Override
	public String toString() {
		return "Student [studentRollNo=" + studentRollNo + ", standaredId=" + standaredId + ", course=" + course
				+ ", techer=" + techer + "]";
	}

	
	
	
	

	
	
}
