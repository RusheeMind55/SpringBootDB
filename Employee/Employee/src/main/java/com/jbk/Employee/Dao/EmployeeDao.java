package com.jbk.Employee.Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.Employee.entity.Employee;

@Repository
public class EmployeeDao {
	
	@Autowired
	SessionFactory factory;
	
	public String insertadata(Employee emp) {
		
	Session session=factory.openSession();
	session.beginTransaction();
	session.getTransaction().commit();
	session.close();
	
		return "save record in Database";
	}

	}

