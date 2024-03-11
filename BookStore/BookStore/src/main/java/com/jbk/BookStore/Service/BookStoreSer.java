package com.jbk.BookStore.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.BookStore.Dao.BookStoreDao;
import com.jbk.BookStore.entity.BookStore;

@Service
public class BookStoreSer {

	@Autowired
	BookStoreDao dao;
	
	
	public String insertdata(BookStore BS) {
		
		String msg=dao.insertdata(BS);
		return msg;
		
	}

	public String Updatedata(int id,BookStore BS) {
		
		String msg1=dao.updateData(id, BS);
		
		return msg1;
	}
}
