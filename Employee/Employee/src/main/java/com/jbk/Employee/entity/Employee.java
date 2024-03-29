package com.jbk.Employee.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.UniqueConstraint;

	@Entity
	public class Employee {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		int id;
	 String	Ename;
	 @Column(unique = true)
	 String	Email;
	 String Mobileno;
	 
	 
	 public Employee() {
		 
	 }
	 
	public Employee(int id, String ename, String email, String mobileno) {
		super();
		this.id = id;
		Ename = ename;
		Email = email;
		Mobileno = mobileno;
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
	@Override
	public String toString() {
		return "Empolyee [id=" + id + ", Ename=" + Ename + ", Email=" + Email + ", Mobileno=" + Mobileno + "]";
	}

	 
	}

