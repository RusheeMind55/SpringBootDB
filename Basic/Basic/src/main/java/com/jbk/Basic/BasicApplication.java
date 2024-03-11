package com.jbk.Basic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BasicApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasicApplication.class, args);
		
		System.out.println("Application Started");
	}

}