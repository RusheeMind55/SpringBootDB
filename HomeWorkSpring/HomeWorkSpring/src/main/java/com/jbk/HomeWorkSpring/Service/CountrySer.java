package com.jbk.HomeWorkSpring.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.HomeWorkSpring.Dao.CountryDao;
import com.jbk.HomeWorkSpring.enity.Counrty;

@Service
public class CountrySer {
	@Autowired
	CountryDao dao;
	
	public String Insertdata(Counrty c) {
		
		String msg=dao.Insertdata(c);
		
		return msg;
		
	}

}
