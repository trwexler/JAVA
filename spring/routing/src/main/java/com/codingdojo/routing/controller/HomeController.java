package com.codingdojo.routing.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class HomeController {
	@RequestMapping("/")
    public String index(
    	@RequestParam(value="q", required=false) String name,
    	@RequestParam(value="s", required=false) String last_name,
    	Model model) {
		
		if(name.equals("")) {
			model.addAttribute("name", "Human");
			model.addAttribute("last_name", "");
			
		}
		else {
			model.addAttribute("name", name);
			model.addAttribute("last_name", last_name);
		}

        return "index.jsp";
    }

}
