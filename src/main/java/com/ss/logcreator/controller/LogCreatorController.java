package com.ss.logcreator.controller;

import java.util.Random;

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
	Random random = new Random();

	@GetMapping(path = "")
	public HttpStatus isUp() {
		HttpStatus status;
		
		// HALF OF THE TIME IT WILL BE OK, A QUARTER 404, A QUARTER 500
		switch( random.nextInt(4) ) {
			case 0:
				status = HttpStatus.OK;
				logger.info(status.toString());
				break;
			case 1:
				status = HttpStatus.OK;
				logger.info(status.toString());
				break;
			case 2:
				status = HttpStatus.NOT_FOUND;
				logger.warn(status.toString());
				break;
			case 3:
				status = HttpStatus.INTERNAL_SERVER_ERROR;
				logger.error(status.toString());
				break;
			default: // will never be reached
				status = HttpStatus.OK;
				logger.info(status.toString());
				break;
		}
		
		return status;
	}
}
