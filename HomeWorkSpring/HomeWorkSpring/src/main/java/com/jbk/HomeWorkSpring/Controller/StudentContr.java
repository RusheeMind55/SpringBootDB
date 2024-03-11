package com.jbk.HomeWorkSpring.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.HomeWorkSpring.Service.EmployeeServ;
import com.jbk.HomeWorkSpring.Service.StudentSer;
import com.jbk.HomeWorkSpring.enity.Empolyee;
import com.jbk.HomeWorkSpring.enity.Student;

@RestController
@RequestMapping("/apistud")
public class StudentContr {
	@Autowired
	StudentSer service;
	
	@PostMapping("/savedata")
	public String saveRecord(@RequestBody Student s) {
		String msg=service.Insertdata(s);
		return msg;
	}
}