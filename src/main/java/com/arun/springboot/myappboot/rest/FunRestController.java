package com.arun.springboot.myappboot.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//intitialize with @RestController to make spring boot aware that it is a Rest Controller
@RestController
public class FunRestController {
	
	
	@GetMapping("/")
	public String sayHello() {
		return "Hello Spring Boot Time on Server is: "+ LocalDateTime.now();
	}
	
	
	

}
