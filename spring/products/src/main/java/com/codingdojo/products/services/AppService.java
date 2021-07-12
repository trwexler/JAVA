package com.codingdojo.products.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.products.models.Category;
import com.codingdojo.products.models.Product;
import com.codingdojo.products.repositories.CategoryRepository;
import com.codingdojo.products.repositories.ProductRepository;

@Service
public class AppService {
	@Autowired
	private ProductRepository pRepo;
	@Autowired
	private CategoryRepository cRepo;
	
	//GetAll Methods:
	public List <Product> getAllProducts(){
		return this.pRepo.findAll();
	}
	
	public List <Category> getAllCategories(){
		return this.cRepo.findAll();
	}
	
	
	//Create Methods:
	public Product createProduct(Product product) {
		return this.pRepo.save(product);
	}
	
	public Category createCategory(Category category) {
		return this.cRepo.save(category);
	}
	
	
	
//	public List<Category> findProductsNotInCategories(Product product) {
//		return cRepo.findByProductsNotContains(product);
//	}
	
	
	

	
}
