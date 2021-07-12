package com.codingdojo.dojo.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.dojo.models.Dojo;
import com.codingdojo.dojo.services.AppService;

@Controller
public class DojoController {
	
	@Autowired
	private AppService aService;
	
	@RequestMapping("/dojos")
	public String index(Model model) {
		model.addAttribute("dojos", this.aService.getAllDojos());
		return "/dojos/index.jsp";
	}
	
	
	@RequestMapping("/dojos/new")
	public String newDojoPage(Model model, @ModelAttribute("dojos") Dojo dojo) {
		model.addAttribute("dojos", dojo);
		return "/dojos/new.jsp";
	}	
	
	@PostMapping("/dojos/new")
	public String addDojo(@Valid @ModelAttribute("dojos") Dojo dojo, BindingResult result) {
	if(result.hasErrors()) {
		return "/dojos/new.jsp";
	}
		this.aService.createDojo(dojo);
		return "redirect:/dojos";
	}
	
	

	
	
}
