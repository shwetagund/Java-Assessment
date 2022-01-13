package com.example.demo.entity;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long CcourseId;
	private Long TeacherId;

	public Long getCcourseId() {
		return CcourseId;
	}

	public void setCcourseId(Long ccourseId) {
		CcourseId = ccourseId;
	}

	public Long getTeacherId() {
		return TeacherId;
	}

	public void setTeacherId(Long teacherId) {
		TeacherId = teacherId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(CcourseId, TeacherId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		return Objects.equals(CcourseId, other.CcourseId) && Objects.equals(TeacherId, other.TeacherId);
	}

	@Override
	public String toString() {
		return "Course [CcourseId=" + CcourseId + ", TeacherId=" + TeacherId + "]";
	}

}