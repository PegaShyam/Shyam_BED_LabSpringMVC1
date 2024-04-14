package com.GL_Lab05.ems.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
	
	@RequestMapping("/welcome")
	public String displayWelcomePage() {
		return "welcome-page";
	}
}
