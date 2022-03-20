package com.simplilearn.phase4.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.phase4.model.Product;
import com.simplilearn.phase4.repository.ProductRepository;
import com.simplilearn.phase4.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	ProductRepository productRepository;
	
	@Override
	public Product createProduct(Product product) {
		return productRepository.save(product);
	}

	@Override
	public List<Product> getProducts() {
		return productRepository.findAll();
	}

	@Override
	public Product getProduct(Long id) {
		Optional<Product> productOptional=productRepository.findById(id);
		if(productOptional.isPresent()) {
			return productOptional.get();
		}
		
		return null;
	}

	@Override
	public Product getProduct(String productName) {
		return null;
	}

	@Override
	public void updateProduct(Long id, Product product) {
		Optional<Product> productOptional=productRepository.findById(id);
		if(productOptional.isPresent()) {
			productRepository.save(product);
		}
	}

	@Override
	public void deleteProduct(Long id) {
		Optional<Product> productOptional=productRepository.findById(id);
		if(productOptional.isPresent()) {
			productRepository.delete(productOptional.get());
		}
	}

}
