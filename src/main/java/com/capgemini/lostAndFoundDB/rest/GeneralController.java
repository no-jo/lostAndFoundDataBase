package com.capgemini.lostAndFoundDB.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GeneralController {
	
	@RequestMapping("/test")
	public String test () {
		return "test";
	}

}
