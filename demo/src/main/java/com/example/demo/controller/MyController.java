package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j2;

@Controller
@Log4j2
@RequestMapping("/my")
public class MyController {
	
	@RequestMapping("/main")
	public void root() {
		log.info("root........");
	}
}
