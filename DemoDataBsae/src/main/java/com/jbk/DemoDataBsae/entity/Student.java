package com.jbk.DemoDataBsae.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String Name;
	String Mobileno;
	String EmailId;
	
	public Student() {
		
	}
	
	public Student(int id, String name, String mobileno, String emailId) {
		super();
		this.id = id;
		Name = name;
		Mobileno = mobileno;
		EmailId = emailId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getMobileno() {
		return Mobileno;
	}
	public void setMobileno(String mobileno) {
		Mobileno = mobileno;
	}
	public String getEmailId() {
		return EmailId;
	}
	public void setEmailId(String emailId) {
		EmailId = emailId;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", Name=" + Name + ", Mobileno=" + Mobileno + ", EmailId=" + EmailId + "]";
	}
	

}