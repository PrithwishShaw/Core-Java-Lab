/*
Program: Employee Management System
@Author: Prithwish Shaw
@Date: 20 October 2022 
 */

package com.ProductCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


//declaring class
public class ProductDaoImpl implements ProductDao{
	
	List<Product> pList= new ArrayList<Product>();
	
	Scanner sc= new Scanner(System.in);

	public void addProduct() {
		
		Product p= new Product();

		System.out.println("Enter the Product name: ");
		p.setProductName(sc.next());
		System.out.println("Enter the Product price: ");
		p.setProductPrice(sc.nextDouble());
		System.out.println("Enter the Product quantity: ");
		p.setQuantity(sc.nextInt());
		
		//Adding Employee into collection
		pList.add(p);
		
		//displaying the added employee
		System.out.println(pList);
		
	}

	public boolean deleteProduct(String name) {
		
		boolean status= false;
		Product pDel=null;
		
		for(Product p:pList) {
			if(p.getProductName()== name)
				pDel=p;
		}
		
		if(pDel==null)
			status=false;
		else {
			pList.remove(pDel);
			status=true;
		}
		return status;
	}

	public void displayAll() {
		
		for(Product p:pList) {
			System.out.println(p);
		}
		
	}

	public void sortPrice() {
		// TODO Auto-generated method stub
		
		Collections.sort(pList, new PriceComparator());
		
		for (Product p : pList) {
			System.out.println(p);
		}
	}

	public void sortQuantity() {
		// TODO Auto-generated method stub
		
		Collections.sort(pList, new QuantityComparator());
		
		for (Product p : pList) {
			System.out.println(p);
		}
		
	}
	
}














