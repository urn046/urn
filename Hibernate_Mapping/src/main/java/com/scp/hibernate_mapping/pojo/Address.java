package com.scp.hibernate_mapping.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Address_Tlb")
public class Address {
	@Id
	@GeneratedValue
	int addId;
	@Column
	String city;
	@Column
	int pin;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String city, int pin, int addId) {
		super();
		this.city = city;
		this.pin = pin;
		this.addId = addId;
	}
	public int getAddIt(){
		return addId;
	}
	public void setAddId(){
		this.addId=addId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "Address [addId=" + addId + ", city=" + city + ", pin=" + pin + "]";
	}


}
