package com.Onetoonespring.one2manyrelationspringproject.enitity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Phone implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 142119343652302519L;
	@Id
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long pid;
	private String comment, phoneNumber;

	@Enumerated(EnumType.STRING)
	private PHONE_TYPE phone_TYPE;

	public Long getPid() {
		return pid;
	}

	public void setPid(Long pid) {
		this.pid = pid;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public PHONE_TYPE getPhone_TYPE() {
		return phone_TYPE;
	}

	public void setPhone_TYPE(PHONE_TYPE phone_TYPE) {
		this.phone_TYPE = phone_TYPE;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(comment, phoneNumber, phone_TYPE, pid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Phone other = (Phone) obj;
		return Objects.equals(comment, other.comment) && Objects.equals(phoneNumber, other.phoneNumber)
				&& phone_TYPE == other.phone_TYPE && Objects.equals(pid, other.pid);
	}

	@Override
	public String toString() {
		return "Phone [pid=" + pid + ", comment=" + comment + ", phoneNumber=" + phoneNumber + ", phone_TYPE="
				+ phone_TYPE + "]";
	}

	

	

}