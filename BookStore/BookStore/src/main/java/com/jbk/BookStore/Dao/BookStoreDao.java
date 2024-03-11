package com.jbk.BookStore.Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.BookStore.entity.BookStore;

@Repository
public class BookStoreDao {
	
	@Autowired
	SessionFactory factory;
	
	public String insertdata(BookStore BS) {
		
	Session session=	factory.openSession();
		session.beginTransaction();
		session.persist(BS);
		session.getTransaction().commit();
		session.close();
		return "save data";
		
		
	}
	
	public String updateData(int id , BookStore Bs) {
		Session session= factory.openSession();
		session.beginTransaction();
		
		BookStore dbRecord= session.get(BookStore.class,id );
		
		dbRecord.setBook_id(Bs.getBook_id());
		dbRecord.setName(Bs.getName());
		dbRecord.setPrice(Bs.getPrice());
		
		session.merge(dbRecord);
		
		session.getTransaction().commit();
		session.update(dbRecord);
		session.close();
		
		return "Data is Updatated....";				
		
	}
	

}
