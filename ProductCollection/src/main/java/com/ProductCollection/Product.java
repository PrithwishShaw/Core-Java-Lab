/*
Program: Employee Management System
@Author: Prithwish Shaw
@Date: 20 October 2022 
 */

package com.ProductCollection;

//declaring class
public class Product {
	
	private String productName;
	private double productPrice;
	private int quantity;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Product(String productName, double productPrice, int quantity) {
		super();
		this.productName = productName;
		this.productPrice = productPrice;
		this.quantity = quantity;
	}
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		return "Product [productName=" + productName + ", productPrice=" + productPrice + ", quantity=" + quantity
				+ "]";
	}
		
}