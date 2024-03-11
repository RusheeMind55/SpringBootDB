package com.jbk.HomeWorkSpring.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.HomeWorkSpring.Service.AddresSer;
import com.jbk.HomeWorkSpring.enity.Address;

@RestController
@RequestMapping("/AddreApi")
public class AddressContr {
	
	@Autowired
	
	AddresSer service;
	
	@PostMapping
	public String savedata(@RequestBody  Address A) {
		
		String msg=service.Inserdata(A);
		
		
		return msg;
	}

}
