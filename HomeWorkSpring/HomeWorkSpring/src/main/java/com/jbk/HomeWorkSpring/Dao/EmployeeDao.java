package com.jbk.HomeWorkSpring.Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.HomeWorkSpring.enity.Empolyee;

@Repository
public class EmployeeDao {
	
	@Autowired
	
	SessionFactory factory;
	
	public String Insertdata(Empolyee Emp) {
		
		Session session= factory.openSession();
		session.beginTransaction();
		session.persist(Emp);
		session.getTransaction().commit();
		session.close();
		return "record are save";
	}

}
