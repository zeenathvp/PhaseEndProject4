package com.simplilearn.phase4.controller;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.simplilearn.phase4.model.Category;
import com.simplilearn.phase4.service.CategoryService;

@Controller
public class PurchaseOrderController {
	
	@Autowired
	CategoryService categoryService;
	
	@RequestMapping(value = "/vwPurchaseReports", method = RequestMethod.GET)
	public String ManageProducts(Model model) {
		List<Category> categoryList = categoryService.getCategories();
		model.addAttribute("categoryList", categoryList);
		return "PurchaseReports";
	}
	
	@RequestMapping(value = "/findPurchaseReports", method = RequestMethod.POST)
	String findPurchaseReports(@RequestParam("orderDate") String orderDate,@RequestParam(value="category") Category category,Model model) throws ParseException {
		DateFormat format = new SimpleDateFormat("mm/dd/yyyy");
		Date purchaseDate = format.parse(orderDate);
		
		
		return "PurchaseReports";
	}
}
