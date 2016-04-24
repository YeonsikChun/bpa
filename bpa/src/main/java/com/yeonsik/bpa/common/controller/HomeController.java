package com.yeonsik.bpa.common.controller;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import ch.qos.logback.classic.Logger;

@Controller
public class HomeController {
	private static final Logger log = (Logger) LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping("/")
	public String home(){
		return "_home";
	}

}