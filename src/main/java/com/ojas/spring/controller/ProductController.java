package com.ojas.spring.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ojas.spring.model.Product;
import com.ojas.spring.repo.ProductRepo;

@RestController
@CrossOrigin
public class ProductController {

	@Autowired
	private ProductRepo repos;
	
	@GetMapping("/test")
	public String test() {
		return "hlo spring";
	}
	
	@PostMapping("/create")
	public Product createProduct(@RequestBody Product product) {
		return repos.save(product);
	}
	
	@GetMapping("/getproducts")
	public List<Product> getAllProducts(){
		return repos.findAll();
	}
	
	
	@GetMapping("/getbyid/{productId}")
	public Optional<Product> getById(@PathVariable("productId") int productId){
		return repos.findById(productId);
	}
	
	@DeleteMapping("/delete/{productId}")
	public void deleteProduct(@PathVariable("productId") int productId) {
		repos.deleteById(productId);
	}
	
	@PutMapping("/update")
	public Product updateProduct(@RequestBody Product updateprod) {
		return repos.saveAndFlush(updateprod);
	}
} 
