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
public class Products implements Serializable {

	/**
	*
	*/
	private static final long serialVersionUID = 100L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long storeId;

	@Column
	private String productDescp;

	private String peoductDept;
	
	@OneToMany(cascade = CascadeType.ALL)
	private Set<SalesFact> sf;

	public Long getStoreId() {
		return storeId;
	}

	public void setStoreId(Long storeId) {
		this.storeId = storeId;
	}

	public String getProductDescp() {
		return productDescp;
	}

	public void setProductDescp(String productDescp) {
		this.productDescp = productDescp;
	}

	public String getPeoductDept() {
		return peoductDept;
	}

	public void setPeoductDept(String peoductDept) {
		this.peoductDept = peoductDept;
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
		return Objects.hash(peoductDept, productDescp, sf, storeId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Products other = (Products) obj;
		return Objects.equals(peoductDept, other.peoductDept) && Objects.equals(productDescp, other.productDescp)
				&& Objects.equals(sf, other.sf) && Objects.equals(storeId, other.storeId);
	}

	@Override
	public String toString() {
		return "Products [storeId=" + storeId + ", productDescp=" + productDescp + ", peoductDept=" + peoductDept
				+ ", sf=" + sf + "]";
	}
	
	
}