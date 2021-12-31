package com.example.demo.entity;

import java.io.Serializable;
import java.util.Objects;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class SalesFact implements Serializable {

	/**
	*
	*/
	private static final long serialVersionUID = 100L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long salesId;

	@Column
	private Double amt;
	private Double qutity;
	private Double cost;

	public Long getSalesId() {
		return salesId;
	}

	public void setSalesId(Long salesId) {
		this.salesId = salesId;
	}

	public Double getAmt() {
		return amt;
	}

	public void setAmt(Double amt) {
		this.amt = amt;
	}

	public Double getQutity() {
		return qutity;
	}

	public void setQutity(Double qutity) {
		this.qutity = qutity;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(amt, cost, qutity, salesId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SalesFact other = (SalesFact) obj;
		return Objects.equals(amt, other.amt) && Objects.equals(cost, other.cost)
				&& Objects.equals(qutity, other.qutity) && Objects.equals(salesId, other.salesId);
	}

	@Override
	public String toString() {
		return "SalesFact [salesId=" + salesId + ", amt=" + amt + ", qutity=" + qutity + ", cost=" + cost + "]";
	}

}