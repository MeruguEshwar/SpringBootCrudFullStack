package com.ojas.spring.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="PRODUCT_NEW")

public class Product {

	@Id
	private int productId;
	private String productName;
	private String productprice;
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
	public String getProductprice() {
		return productprice;
	}
	public void setProductprice(String productprice) {
		this.productprice = productprice;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productprice=" + productprice
				+ "]";
	}
	public Product(int productId, String productName, String productprice) {
		this.productId = productId;
		this.productName = productName;
		this.productprice = productprice;
	}
	
	public Product() {
		
	}
}
