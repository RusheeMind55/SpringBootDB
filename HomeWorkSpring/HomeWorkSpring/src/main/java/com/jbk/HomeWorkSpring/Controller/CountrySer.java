package com.jbk.HomeWorkSpring.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.HomeWorkSpring.enity.Counrty;

@RestController
@RequestMapping("/c_Api")
public class CountrySer {

	@Autowired
	CountrySer service;
	
	@PostMapping
	public String Savedata(@RequestBody Counrty c) {
		
		String msg=service.Savedata(c);
	
		return msg;
	}
}
