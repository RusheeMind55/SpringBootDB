package com.jbk.HomeWorkSpring.Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.HomeWorkSpring.enity.Student;
@Repository
public class StudentDao {

    @Autowired
	SessionFactory factory;
	
	public String Insertdata(Student s) {
		
		Session session= factory.openSession();
		
		
		session.beginTransaction();
		session.persist(s);
		
		session.getTransaction().commit();
		
		session.close();
		
		return "record are save";
}}
