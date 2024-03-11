package com.jbk.HomeWorkSpring.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.HomeWorkSpring.Service.EmployeeServ;
import com.jbk.HomeWorkSpring.enity.Empolyee;

@RestController
@RequestMapping("/api")
public class EmployeeContr {
	
	@Autowired
	EmployeeServ service;
	
	@PostMapping("/saveRecord")
	public String saveRecord(@RequestBody   Empolyee Emp) {
		String msg=service.Insertdata(Emp);
		return msg;
		
	}
	

}
