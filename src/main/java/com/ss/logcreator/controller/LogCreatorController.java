package com.ss.logcreator.controller;

import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/*")
public class LogCreatorController {
	
	@GetMapping(path = "")
	public HttpStatus isUp() 
	{
		System.out.println(Instant.now() + " " + HttpStatus.OK);
		return HttpStatus.OK;
	}
}
