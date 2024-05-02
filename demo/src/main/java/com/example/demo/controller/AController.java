package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import lombok.extern.log4j.Log4j2;

@Controller
@Log4j2
@RequestMapping("/a")
public class AController {
	
	@RequestMapping("/main")
	public String main(HttpServletRequest request, Model model) {
		HttpSession session = request.getSession();
		log.info("A_main.....");
		if(session.getAttribute("id") == null) {
			model.addAttribute("id", "SSS");
		}
		return "a/main";
		
		
	}
	@RequestMapping("/sub")
	public String sub(HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.setAttribute("id", "bbb");
		log.info("A_main.....");
		return "a/main";
	}
}
