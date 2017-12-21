package com.tpg.microservices.test1.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test1 {

	@RequestMapping("/")
	public String test() {
		return "Hello From Test1";
	}
	
}
