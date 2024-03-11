package com.jbk.HomeWorkSpring.Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.HomeWorkSpring.enity.Counrty;

@Repository
public class CountryDao {
	
	@Autowired
	
	SessionFactory factory;
	
	public String Insertdata(Counrty c) {
		  Session session=factory.openSession();
		  session.beginTransaction();
		  session.persist(c);
		  session.getTransaction().commit();
		  session.close();
		
		
		return "save Record";
	}

}
