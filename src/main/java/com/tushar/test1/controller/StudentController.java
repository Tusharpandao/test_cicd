package com.tushar.test1.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class StudentController {
	
	@GetMapping("/studentwelcome")
	public String studentwel() {
		return new String("welcome to test classs");
	}
	

}
