package com.simplilearn.phase4.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;

@Entity
public class PurchaseOrder {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long orderId;
	private Date orderDate;
	
	@ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
        name = "order_category", 
        joinColumns = { @JoinColumn(name = "orderId") }, 
        inverseJoinColumns = { @JoinColumn(name = "categoryId") }
    )	
	private List<Category> categories;

	public PurchaseOrder(Long orderId, Date orderDate, List<Category> categories) {
		super();
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.categories = categories;
	}

	public PurchaseOrder() {
		super();
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public List<Category> getCategories() {
		return categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}
	
	
}
