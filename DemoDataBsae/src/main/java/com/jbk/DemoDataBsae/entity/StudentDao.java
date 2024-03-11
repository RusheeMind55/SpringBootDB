package com.jbk.DemoDataBsae.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



@Repository
public class StudentDao {


	@Autowired
	SessionFactory factory;
	
	public String insertData(Student s) {
		
		Session session= factory.openSession();
		session.beginTransaction();
		session.persist(s);
		session.getTransaction().commit();
		session.close();
		return "Record is Saved";

		
		
	 
	}	}


