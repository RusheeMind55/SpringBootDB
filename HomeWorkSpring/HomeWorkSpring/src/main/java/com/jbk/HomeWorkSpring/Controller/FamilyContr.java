package com.jbk.HomeWorkSpring.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.HomeWorkSpring.Service.FamilySer;
import com.jbk.HomeWorkSpring.enity.Family;
@RestController
@RequestMapping("/FamilyApi")
public class FamilyContr {


	@Autowired
	
	FamilySer service;
	
	@PostMapping
	public String savedata(@RequestBody  Family f) {
		
		String msg=service.Inserdata(f);
		
		
		return msg;
	}
}
