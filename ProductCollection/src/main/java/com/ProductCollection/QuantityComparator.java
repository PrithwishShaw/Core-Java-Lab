package com.ProductCollection;

import java.util.Comparator;

public class QuantityComparator implements Comparator<Product> {

	public int compare(Product p1, Product p2) {
		
		if (p1.getQuantity() == p2.getQuantity())
			return 0;
		else if (p1.getQuantity() > p2.getQuantity())
			return 1;
		else
			return -1;

	}

}
