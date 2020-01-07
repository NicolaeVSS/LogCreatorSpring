package com.ss.logcreator.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/*")
public class LogCreatorController {

	Logger logger = LoggerFactory.getLogger(LogCreatorController.class);

	@GetMapping(path = "")
	public HttpStatus isUp() {
		logger.info(HttpStatus.OK.toString());
		return HttpStatus.OK;
	}
}
