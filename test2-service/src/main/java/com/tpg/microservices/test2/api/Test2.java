package com.tpg.microservices.test2.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test2 {

	@RequestMapping("/")
	public String test() {
		return "Hello From Test2";
	}
	
}
