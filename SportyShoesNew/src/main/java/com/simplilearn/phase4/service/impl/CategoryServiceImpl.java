package com.simplilearn.phase4.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.phase4.model.Category;
import com.simplilearn.phase4.repository.CategoryRepository;
import com.simplilearn.phase4.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService{
	@Autowired
	CategoryRepository categoryRepository;
	
	@Override
	public Category createCategory(Category category) {
		return categoryRepository.save(category);
	}

	@Override
	public List<Category> getCategories() {
		return categoryRepository.findAll();
	}

	@Override
	public Category getCategory(Long id) {
		return null;
	}

	@Override
	public Category getCategory(String categoryName) {
		return null;
	}

	@Override
	public void updateCategory(Long id, Category category) {
		
	}

	@Override
	public void deleteCategory(Long id) {
		
	}

}
