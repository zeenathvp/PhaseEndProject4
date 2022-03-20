package com.simplilearn.phase4.service;

import java.util.List;

import com.simplilearn.phase4.model.Category;

public interface CategoryService {
	//CREATE
	Category createCategory(Category category);

	//READ
	List<Category> getCategories();
	Category getCategory(Long id);
	Category getCategory(String categoryName);

	//UPDATE
	void updateCategory(Long id, Category category);

	
	//DELETE
	void deleteCategory(Long id);
}
