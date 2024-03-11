package com.jbk.HomeWorkSpring.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.HomeWorkSpring.Dao.EmployeeDao;
import com.jbk.HomeWorkSpring.enity.Empolyee;

@Service
public class EmployeeServ {
	
	@Autowired
	EmployeeDao dao;
	
	public String Insertdata(Empolyee Emp) {
	
		String msg= dao.Insertdata(Emp);
		
		return msg;
		
		
	}
	

}
