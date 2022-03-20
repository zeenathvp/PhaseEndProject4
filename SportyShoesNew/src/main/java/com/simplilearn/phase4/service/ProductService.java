package com.simplilearn.phase4.service;

import java.util.List;

import com.simplilearn.phase4.model.Product;

public interface ProductService {
	//CREATE
	Product createProduct(Product product);

	//READ
	List<Product> getProducts();
	Product getProduct(Long id);
	Product getProduct(String productName);

	//UPDATE
	void updateProduct(Long id, Product product);

	
	//DELETE
	void deleteProduct(Long id);
}
