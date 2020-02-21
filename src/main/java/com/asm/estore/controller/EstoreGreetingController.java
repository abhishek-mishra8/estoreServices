package com.asm.estore.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EstoreGreetingController {
	
	@RequestMapping(method=RequestMethod.GET,path="/greetings")
	public String displayGreeting() {
		return "Hello welcome to the new container";
	}

}
