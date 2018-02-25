package com.scp.hibernate_mapping.pojo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Employee_Tlb")
public class Employee {
	@Id
	@GeneratedValue	
	int empId;
	@Column
	String name;
	@Column
	double sal;
	@OneToOne(cascade = CascadeType.ALL)
	Address ad;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empId, String name, double sal, Address ad) {
		super();
		this.empId = empId;
		this.name = name;
		this.sal = sal;
		this.ad = ad;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public Address getAd() {
		return ad;
	}
	public void setAd(Address ad) {
		this.ad = ad;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", sal=" + sal + ", ad=" + ad + "]";
	}
	
	

}
