package com.jbk.HomeWorkSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

import com.jbk.HomeWorkSpring.enity.Counrty;

@SpringBootApplication
@ComponentScan("com.jbk.HomeWorkSpring.enity.Counrty")
@ComponentScan("com.jbk.HomeSpring")
@EntityScan("com.jbk.HomeWorkSpring")

public class HomeWorkSpringApplication{

	public static void main(String[] args) {
		SpringApplication.run(HomeWorkSpringApplication.class, args);
		
		System.out.println("Multiple..Started Application........");
		
		
	}

}
