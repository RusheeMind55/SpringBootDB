package com.jbk.HomeWorkSpring.enity;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Component
@Entity
public class Counrty {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int c_id;
	@Column(unique = true)
	String c_name;
	
	public Counrty() {
		
	}
	
	
	public Counrty(int c_id, String c_name) {
		super();
		this.c_id = c_id;
		this.c_name = c_name;
	}
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	@Override
	public String toString() {
		return "Counrty [c_id=" + c_id + ", c_name=" + c_name + "]";
	}
	
	

}
