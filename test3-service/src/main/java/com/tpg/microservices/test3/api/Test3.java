package com.tpg.microservices.test3.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test3 {

	@RequestMapping("/test3")
	public String test() {
		return "Hello From Test3";
	}
	
}
