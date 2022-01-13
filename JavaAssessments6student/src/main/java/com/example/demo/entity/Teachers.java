package com.example.demo.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import io.vavr.collection.Set;

@Entity
public class Teachers implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long TeacherId;

	@Column
	private String TeacherName;
	private String TeacherType;

	@OneToMany(cascade = CascadeType.ALL)
	private Set<Student> stud;

	public Long getTeacherId() {
		return TeacherId;
	}

	public void setTeacherId(Long teacherId) {
		TeacherId = teacherId;
	}

	public String getTeacherName() {
		return TeacherName;
	}

	public void setTeacherName(String teacherName) {
		TeacherName = teacherName;
	}

	public String getTeacherType() {
		return TeacherType;
	}

	public void setTeacherType(String teacherType) {
		TeacherType = teacherType;
	}

	public Set<Student> getStud() {
		return stud;
	}

	public void setStud(Set<Student> stud) {
		this.stud = stud;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(TeacherId, TeacherName, TeacherType, stud);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Teachers other = (Teachers) obj;
		return Objects.equals(TeacherId, other.TeacherId) && Objects.equals(TeacherName, other.TeacherName)
				&& Objects.equals(TeacherType, other.TeacherType) && Objects.equals(stud, other.stud);
	}

	@Override
	public String toString() {
		return "Teachers [TeacherId=" + TeacherId + ", TeacherName=" + TeacherName + ", TeacherType=" + TeacherType
				+ ", stud=" + stud + "]";
	}

}
