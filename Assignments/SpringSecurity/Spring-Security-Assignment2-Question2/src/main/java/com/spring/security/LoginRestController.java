package com.spring.security;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginRestController {

	@RequestMapping("/")
	public String HomePage() {
		return "Home Page";
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