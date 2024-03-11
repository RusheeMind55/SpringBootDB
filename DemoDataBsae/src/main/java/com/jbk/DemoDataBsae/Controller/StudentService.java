package com.jbk.DemoDataBsae.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.DemoDataBsae.entity.Student;
import com.jbk.DemoDataBsae.entity.StudentDao;

@Service
public class StudentService {

	@Autowired
	StudentDao dao;
	
	public String InsertData(Student s) {
		
			String msg=dao.insertData(s);
			return msg;
		
	}
		 
	}


