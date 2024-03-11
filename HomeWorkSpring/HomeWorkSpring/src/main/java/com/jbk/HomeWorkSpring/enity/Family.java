package com.jbk.HomeWorkSpring.enity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Component
public class Family {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	@Column(unique = true)
	int AdharNo;
	@Column(unique = true)
	int Passortno;
	@Column(unique = true)
	int DrivingLic_No;
	
	public Family() {
		
	}
	
	public Family(int id, int adharNo, int passortno, int drivingLic_No) {
		super();
		this.id = id;
		AdharNo = adharNo;
		Passortno = passortno;
		DrivingLic_No = drivingLic_No;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAdharNo() {
		return AdharNo;
	}
	public void setAdharNo(int adharNo) {
		AdharNo = adharNo;
	}
	public int getPassortno() {
		return Passortno;
	}
	public void setPassortno(int passortno) {
		Passortno = passortno;
	}
	public int getDrivingLic_No() {
		return DrivingLic_No;
	}
	public void setDrivingLic_No(int drivingLic_No) {
		DrivingLic_No = drivingLic_No;
	}
	@Override
	public String toString() {
		return "Family [id=" + id + ", AdharNo=" + AdharNo + ", Passortno=" + Passortno + ", DrivingLic_No="
				+ DrivingLic_No + "]";
	}
	

}
