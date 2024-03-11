package com.jbk.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.PracticeSpring.Student;

@RestController
@RequestMapping()
public class StudentController {
	
	@PostMapping("/savestd")
	public String SaveRecord(@RequestBody Student std) {
		System.out.println(std);
		return "save" +std;
	}

}
