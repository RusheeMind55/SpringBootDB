package com.jbk.HomeWorkSpring.Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.HomeWorkSpring.enity.Address;

@Repository
public class AddressDao {
	
	@Autowired
	
	SessionFactory factory;
	
	public String Insertdata(Address A) {
		
	Session session=factory.openSession();
	session.beginTransaction();
	session.persist(A);
	session.getTransaction().commit();
	session.close();
	
		return "save the data";
	}

}
