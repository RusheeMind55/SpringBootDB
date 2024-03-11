package com.jbk.DemoDataBsae.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.DemoDataBsae.entity.Student;

@RestController
@RequestMapping("/apist")
public class Controller {

		
		@Autowired
		StudentService service;
		
		@PostMapping("/savedata")
		public String saveRecord(@RequestBody Student s) {
			
			String msg= service.InsertData(s);
			
			return msg;
			
		
	}
}
