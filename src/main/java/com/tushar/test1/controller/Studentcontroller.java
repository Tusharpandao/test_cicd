package com.tushar.test1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Studentcontroller {

	
	@GetMapping("/")
	public String studnetwel() {
	
		return new String("Welcome to testing project");
	}
}
