package com.codingdojo.displayDate.controllers;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DateController {
	
	private Date getDate() {
		Date now = new Date();
		return now;
	}
	
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}

	
//model object/class acts as way to get java info from back to front end
	//STEPS:
		//1. Call on Model object followed by name (Model viewModel)
		//2. Add an attribute to the viewModel model with MODEL_NAME.addAttribute("ATTRIBUTE_NAME", ATTRIBUTE_VALUE) method
	
	
	@RequestMapping("/date")
	public String date(Model viewModel) {
		viewModel.addAttribute("dateTime", getDate());
		return "date.jsp";
	}
	
	@RequestMapping("/time")
	public String time(Model viewModel) {
		viewModel.addAttribute("dateTime", getDate());
		return "time.jsp";
	}
}







