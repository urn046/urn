package com.scp.hbm.Hbm_pojo;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

@Entity
@Table(name="Employee_tlb")
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="eid")
	Integer eid;
	
	String ename;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="eid")
	Set<Bank> bank;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee( int eid,String ename, Set<Bank> bank) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.bank = bank;
	}
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Set<Bank> getBank() {
		return bank;
	}
	public void setBank(Set<Bank> bank) {
		this.bank = bank;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", bank=" + bank + "]";
	}
	
	
}
