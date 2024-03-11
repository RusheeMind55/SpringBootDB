package com.jbk.HomeWorkSpring.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.HomeWorkSpring.Dao.AddressDao;
import com.jbk.HomeWorkSpring.enity.Address;

@Service
public class AddresSer {
	
	@Autowired
	 AddressDao dao;
	
	public String Inserdata(Address A) {
		
		String msg=dao.Insertdata(A);
		
		return msg;
	}

}
