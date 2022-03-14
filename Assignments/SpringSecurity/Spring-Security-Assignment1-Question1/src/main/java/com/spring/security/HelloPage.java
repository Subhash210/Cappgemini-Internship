package com.spring.security;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloPage {

	@RequestMapping("/")
	public String Home() {
		return "Hello World";
	}

	@RequestMapping("/user")
	public String User() {
		return "Hello User";
	}

	@RequestMapping("/admin")
	public String admin() {
		return "Hello Admin";
	}

}
