package com.simplilearn.phase4.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String productName;
	private double price;
	@ManyToOne
	@JoinColumn(name="categoryId")
	private Category category;
	
	public Product(Long id, String productName, double price, Category category) {
		super();
		this.id = id;
		this.productName = productName;
		this.price = price;
		this.category = category;
	}
	
	
	public Product(String productName, double price, Category category) {
		super();
		this.productName = productName;
		this.price = price;
		this.category = category;
	}

	
	public Product(String productName, double price) {
		super();
		this.productName = productName;
		this.price = price;
	}


	public Product() {
		super();
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", productName=" + productName + ", price=" + price + ", category=" + category
				+ "]";
	}
	
}
