package com.jbk.HomeWorkSpring.enity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Component
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
 String	Ename;
 @Column(unique = true)
 String	Email;
 String Mobileno;
 String Branch;
 
 public Student() {
	 
 }
 
public Student(int id, String ename, String email, String mobileno, String branch) {
	super();
	this.id = id;
	Ename = ename;
	Email = email;
	Mobileno = mobileno;
	Branch = branch;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getEname() {
	return Ename;
}
public void setEname(String ename) {
	Ename = ename;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
public String getMobileno() {
	return Mobileno;
}
public void setMobileno(String mobileno) {
	Mobileno = mobileno;
}
public String getBranch() {
	return Branch;
}
public void setBranch(String branch) {
	Branch = branch;
}
@Override
public String toString() {
	return "Student [id=" + id + ", Ename=" + Ename + ", Email=" + Email + ", Mobileno=" + Mobileno + ", Branch="
			+ Branch + "]";
}
 
}
