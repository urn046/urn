package com.scp.hbm.Hbm_pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Bank {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer bid;
	String name;
	@ManyToOne
	Employee employee;
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bank( String name) {
		super();
	
		this.name = name;
	}
	public Integer getBid() {
		return bid;
	}
	public void setBid(Integer bid) {
		this.bid = bid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Bank [bid=" + bid + ", name=" + name + ", employee=" + employee + "]";
	}
	

}
