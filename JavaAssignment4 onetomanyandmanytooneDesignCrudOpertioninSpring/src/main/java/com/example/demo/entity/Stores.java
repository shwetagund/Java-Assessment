package com.example.demo.entity;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Stores implements Serializable {

	/**
	*
	*/
	private static final long serialVersionUID = 100L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long storeId;

	@Column
	private String storeDescp;

	private String storeAdd;
	
	@OneToMany(cascade = CascadeType.ALL)
	private Set<SalesFact> sf;

	public Long getStoreId() {
		return storeId;
	}

	public void setStoreId(Long storeId) {
		this.storeId = storeId;
	}

	public String getStoreDescp() {
		return storeDescp;
	}

	public void setStoreDescp(String storeDescp) {
		this.storeDescp = storeDescp;
	}

	public String getStoreAdd() {
		return storeAdd;
	}

	public void setStoreAdd(String storeAdd) {
		this.storeAdd = storeAdd;
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
		return Objects.hash(sf, storeAdd, storeDescp, storeId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Stores other = (Stores) obj;
		return Objects.equals(sf, other.sf) && Objects.equals(storeAdd, other.storeAdd)
				&& Objects.equals(storeDescp, other.storeDescp) && Objects.equals(storeId, other.storeId);
	}

	@Override
	public String toString() {
		return "Stores [storeId=" + storeId + ", storeDescp=" + storeDescp + ", storeAdd=" + storeAdd + ", sf=" + sf
				+ "]";
	}
	
	
	
}