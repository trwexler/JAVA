package com.codingdojo.products.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.products.models.Product;
import com.codingdojo.products.services.AppService;

@Controller
public class ProductController {

	@Autowired
	private AppService aService;
	
	@RequestMapping("/products")
	public String products(Model model){
		model.addAttribute("products", this.aService.getAllProducts());
		return "/products/products.jsp";
	}
	
	
	@RequestMapping("/products/new")
	public String newProductsPage(Model model, @ModelAttribute("products") 	Product product) {
		model.addAttribute("products", product);
		return "/products/newProduct.jsp";
	}
	
	@PostMapping("/products/new")
	public String newProduct(Model model, @ModelAttribute("products") Product 	product, BindingResult result) {
	if(result.hasErrors()) {
		return "/products/newProduct.jsp";
	}
	this.aService.createProduct(product);
	return "redirect:/products";
	}
	
	
	
	
}
