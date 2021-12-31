package com.example.demo.entity;

import java.util.Objects;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.data.relational.core.mapping.Column;

@Entity
public class Dates {
	private static final long serialVersionUID = -4007142105224945278L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private int DateId;
	@Column
	private int Year;
	private int Month;
	private int Day;
	private int FullDay;
	private int Ouater;

	
	@OneToMany(cascade = CascadeType.ALL)
	private Set<SalesFact> sf;


	public int getDateId() {
		return DateId;
	}


	public void setDateId(int dateId) {
		DateId = dateId;
	}


	public int getYear() {
		return Year;
	}


	public void setYear(int year) {
		Year = year;
	}


	public int getMonth() {
		return Month;
	}


	public void setMonth(int month) {
		Month = month;
	}


	public int getDay() {
		return Day;
	}


	public void setDay(int day) {
		Day = day;
	}


	public int getFullDay() {
		return FullDay;
	}


	public void setFullDay(int fullDay) {
		FullDay = fullDay;
	}


	public int getOuater() {
		return Ouater;
	}


	public void setOuater(int ouater) {
		Ouater = ouater;
	}


	public Set<SalesFact> getSf() {
		return sf;
	}


	public void setSf(Set<SalesFact> sf) {
		this.sf = sf;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public int hashCode() {
		return Objects.hash(DateId, Day, FullDay, Month, Ouater, Year, sf);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dates other = (Dates) obj;
		return DateId == other.DateId && Day == other.Day && FullDay == other.FullDay && Month == other.Month
				&& Ouater == other.Ouater && Year == other.Year && Objects.equals(sf, other.sf);
	}


	@Override
	public String toString() {
		return "Dates [DateId=" + DateId + ", Year=" + Year + ", Month=" + Month + ", Day=" + Day + ", FullDay="
				+ FullDay + ", Ouater=" + Ouater + ", sf=" + sf + "]";
	}

	
}
