package com.ProductCollection;

import java.util.Comparator;

public class PriceComparator implements Comparator<Product> {

	public int compare(Product p1, Product p2) {
		
		if (p1.getProductPrice() == p2.getProductPrice())
			return 0;
		else if (p1.getProductPrice() > p2.getProductPrice())
			return 1;
		else
			return -1;

	}

}
