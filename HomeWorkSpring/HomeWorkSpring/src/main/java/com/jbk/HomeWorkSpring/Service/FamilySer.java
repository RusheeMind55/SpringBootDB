package com.jbk.HomeWorkSpring.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.HomeWorkSpring.Dao.FamilyDao;
import com.jbk.HomeWorkSpring.enity.Family;
@Service 
public class FamilySer {
	@Autowired
	 FamilyDao dao;
	
	public String Inserdata(Family f) {
		
		String msg=dao.Insertdata(f);
		
		return msg;

}
}