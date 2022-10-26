package com.ProductCollection;


import java.util.Scanner;


public class App 
{
	public static void menu() {
		System.out.println("MENU:");
		System.out.println("1. Add Product");
		System.out.println("2. Delete Product");
		System.out.println("3. Display all the Product");
		System.out.println("4. To sort by price");
		System.out.println("5. To sort by quantity");
		System.out.println("6. Exit");
	}
	
    public static void main( String[] args ) {
    	
    	Scanner sc= new Scanner(System.in);
    	
    	ProductDao company= new ProductDaoImpl();
    	
    	int ch=0;
    	
    	do {
    		
    		//calling method 
    		menu();
    		
    		//taking input in choice 
    		ch=sc.nextInt();
    		
    		//switch for performing the operations
    		switch(ch) {
    		
    		//case for adding employee
    		case 1:
    			company.addProduct();
    			System.out.println("Product Added..........");
				break;
				
			//case for deleting employee	
    		case 2:
    			System.out.println("Enter the ID to be Deleted");
    			String name=sc.next();
    			boolean flag=company.deleteProduct(name);
    			if(flag)
    				System.out.println("Product Deleted.........");
    			else
    				System.out.println("Product not found........");
    			break;
    		case 3:
    			company.displayAll();
    			break;
    		case 4:
    			company.sortPrice();
    			break;
    		case 5:
    			company.sortQuantity();
    			break;
    		case 6:
    			System.exit(0);
    			break;
    		default:
    			System.out.println("Wrong input........");
    		}
    	}
    	//end of do
    	while(ch!=6);	//performing the operations till the choice is not 6
    	
    	sc.close();		//closing the scanner
    	
    }
    //end of main method
}
    	

  
