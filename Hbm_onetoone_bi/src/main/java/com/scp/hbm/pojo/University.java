package com.scp.hbm.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name="University_tlb")

public class University {
	@Id
	@GeneratedValue(generator="gen")
	@GenericGenerator(name="gen",strategy="foreign",parameters=@Parameter(name="property",value="student"))
	@Column(name="University_id")
	Integer uid;
	@Column(name="University_name")
	String uname;
	@OneToOne
	@PrimaryKeyJoinColumn
	Student student;
	public University() {
		super();
		// TODO Auto-generated constructor stub
	}
	public University(String uname) {
		super();
		
		this.uname = uname;
		
	}
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "University [uid=" + uid + ", uname=" + uname +"]";
	}
	

}
