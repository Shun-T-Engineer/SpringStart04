package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeSpringController {
	
	@GetMapping("/welcome")
	public String welcom() {
		// HTMLテンプレートにwelcom-spring.htmlを指定
		return "welcom-spring";
	}

}
