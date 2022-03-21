package com.simplilearn.phase4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.simplilearn.phase4.model.Category;
import com.simplilearn.phase4.model.Product;
import com.simplilearn.phase4.service.CategoryService;
import com.simplilearn.phase4.service.ProductService;

@Controller

public class ProductController {
	
	@Autowired
	ProductService productsService;
	
	@Autowired
	CategoryService categoryService;
	
	@RequestMapping(value = "/manageProducts", method = RequestMethod.GET)
	public String ManageProducts(Model model) {
		return "ManageProducts";
	}
	
	@RequestMapping(value = "/addProductView", method = RequestMethod.GET)
	public String AddProduct(Model model) {
		List<Category> categoryList = categoryService.getCategories();
		model.addAttribute("categoryList", categoryList);
		return "AddProduct";
	}
	
	
	@RequestMapping(value = "/viewProducts", method = RequestMethod.GET)
	public String ViewProducts(Model model) {		
		List<Product> products = productsService.getProducts();
		model.addAttribute("productList", products);
		return "ViewProducts";
	}
	
	@RequestMapping(value = "/addproduct", method = RequestMethod.POST)
	String saveProduct(@RequestParam(value="pdtName") String pdtName, @RequestParam(value="pdtPrice", defaultValue = "0.00") double pdtPrice, @RequestParam(value="category") Category category,Model model ) {
		if(pdtName == null || pdtName.trim()=="") {
			return "error";
		}
		if(pdtPrice == 0.00) {
			return "error";
		}
		if(category.getCategoryName()=="Select One") {
			return "error";
		}
		Product product = new Product(pdtName,pdtPrice,category);
		productsService.createProduct(product);
		return "home";
	}
	
	@RequestMapping(value = "/addCategoryView", method = RequestMethod.GET)
	public String AddCategory(Model model) {
		return "AddCategory";
	}
	
	@RequestMapping(value = "/addcategory", method = RequestMethod.POST)
	String saveCategory(@RequestParam("catName") String catName,Model model) {
		if(catName == null || catName.trim()=="") {
			return "error";
		}
		Category category = new Category(catName);
		categoryService.createCategory(category);
		return "home";
	}
}
