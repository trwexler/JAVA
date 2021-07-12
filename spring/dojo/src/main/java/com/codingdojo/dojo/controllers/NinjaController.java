package com.codingdojo.dojo.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.dojo.models.Ninja;
import com.codingdojo.dojo.services.AppService;

@Controller
public class NinjaController {
	
	@Autowired
	private AppService aService;
	
	
	@RequestMapping("/ninjas")
	public String index(Model model) {
		model.addAttribute("ninjas", this.aService.getAllNinjas());
		return "/ninjas/new.jsp";
	}
	
	
	@RequestMapping("/ninjas/new")
	public String index(@ModelAttribute("ninjas") Ninja ninja, Model model) {
		model.addAttribute("dojos", this.aService.getAllDojos());
		return "/ninjas/new.jsp";
	}
	
	@PostMapping("/ninjas/new")
	public String addDojo(@Valid @ModelAttribute("ninjas") Ninja ninja, BindingResult result, Model model) {
	if(result.hasErrors()) {
		model.addAttribute("dojos", this.aService.getAllDojos());
		return "/ninjas/new.jsp";
	}
		this.aService.createNinja(ninja);
		return "redirect:/dojos";
	}
	
	
	@RequestMapping("/dojos/{id}")
	public String Show(@PathVariable("id") Long id, Model model) {
		model.addAttribute("dojo", this.aService.findDojo(id));
		return "/dojos/show.jsp";
	}
	

}
