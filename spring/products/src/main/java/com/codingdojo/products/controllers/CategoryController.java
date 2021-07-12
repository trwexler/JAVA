package com.codingdojo.products.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.products.models.Category;
import com.codingdojo.products.services.AppService;

@Controller
public class CategoryController {
	
	@Autowired
	private AppService aService;
	
	@RequestMapping("/categories")
	public String products(Model model){
		model.addAttribute("categories", this.aService.getAllCategories());
		return "/categories/categories.jsp";
	}
	
	
	@RequestMapping("/categories/new")
	public String newCategoriesPage(Model model, @ModelAttribute("categories") Category category) {
		model.addAttribute("categories", category);
		return "/categories/newCategory.jsp";
	}
	
	@PostMapping("/categories/new")
	public String newCategory(Model model, @ModelAttribute("categories") Category category, BindingResult result) {
	if(result.hasErrors()) {
		return "/categories/newCategory.jsp";
	}
	this.aService.createCategory(category);
	return "redirect:/categories";
	}
	
	
	
	//show categories page where you can add a product to it:
//	@RequestMapping("/categories/showCategory")
//	public String showCategoriesPage(Model model, @ModelAttribute("categories") Category category) {
//		model.addAttribute("categories", category);
//		return "/categories/showCategory.jsp";
//	}
//	
//	
//	@PostMapping("/categories/showCategory")
//	public String addProductToCategory(Model model, @ModelAttribute("categories") Category category, BindingResult result) {
//	if(result.hasErrors()) {
//		return "/categories/showCategory.jsp";
//	}
//	this.aService.findProductsNotInCategories(category);
//	return "redirect:/categories";
//	}
	
	
	
	
	
	

}
