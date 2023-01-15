package com.productmanagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
public class Product {
	
	@Id
	private int productId;
	@Column(length = 40)
	private String productName;
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + "]";
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int productId, String productName) {
		super();
		this.productId = productId;
		this.productName = productName;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}

}
