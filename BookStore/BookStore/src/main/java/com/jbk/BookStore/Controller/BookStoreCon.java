package com.jbk.BookStore.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.BookStore.Service.BookStoreSer;
import com.jbk.BookStore.entity.BookStore;;

@RestController
@RequestMapping("/apibs")
public class BookStoreCon {

	@Autowired
	BookStoreSer service;
	
	@PostMapping("/savedata")
	public String saveRecord(@RequestBody BookStore BS) {
		
		String msg=service.insertdata(BS);
		
		return msg;
		
	}
	
	@PutMapping("/updatedata/{id}")
	public String UpdateRecors(@PathVariable int id,@RequestBody BookStore Bs) {
		
		String msg= service.Updatedata(id, Bs);
		return msg;
		
	}
	
 }
