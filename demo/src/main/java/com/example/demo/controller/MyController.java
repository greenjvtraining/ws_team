package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j2;

@Controller
@Log4j2
public class MyController {
	
	@RequestMapping("/")
	public String root() {
		log.info("root........");
		return "index";
	}
}
