package com.efreelearn.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/HomeController")
public class HomeController {
	
	@GetMapping(value="/")
	public ResponseEntity<String> getHomePage()
	{
		 ResponseEntity<String> r = new  ResponseEntity<String>(HttpStatus.OK);
		 return r;
	}

}
