package com.scp.hbm.pojo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

@Entity
@Table(name="Student_tlb")
public class Student {
	@Id
	@GeneratedValue
	@Column(name="Student_id")
	Integer rollno;
	@Column(name="Student_name")
	String name;
	
	@OneToOne(mappedBy="student",cascade=CascadeType.ALL)
	//@Column(name="University_stud")
	University uni;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name) {
		super();
		
		this.name = name;
		
	}
	public Integer getRollno() {
		return rollno;
	}
	public void setRollno(Integer rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public University getUni() {
		return uni;
	}
	public void setUni(University uni) {
		this.uni = uni;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", uni=" + uni + "]";
	}


}
