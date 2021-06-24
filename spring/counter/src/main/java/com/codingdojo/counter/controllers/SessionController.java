package com.codingdojo.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SessionController {
	
	
	@RequestMapping("/")
	public String index(HttpSession session) {
		if(session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		}
		else {
			int counter = (int)session.getAttribute("count");
			counter++;
			session.setAttribute("count", counter);
		}
		return "index.jsp";
	}
	
	//model is a catalyst that takes info from the back end (session) and displays it on the front end
	@RequestMapping("/counter")
	public String counter(Model viewModel, HttpSession session) {
		
		Integer currentCount = (Integer)session.getAttribute("count");
		
		if(currentCount == null) {
			viewModel.addAttribute("current", 0);
		}
		
		else {
			viewModel.addAttribute("current", currentCount);
		}
		
		return "counter.jsp";
	}
	
		@RequestMapping("/reset")
		public String reset(HttpSession session) {
			session.setAttribute("count", 0);
			return "redirect:/counter";
	}
	

}
