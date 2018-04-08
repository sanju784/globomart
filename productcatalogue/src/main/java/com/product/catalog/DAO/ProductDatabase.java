package com.product.catalog.DAO;

import java.util.HashMap;
import java.util.Map;

import com.product.catalog.Model.Product;

public class ProductDatabase {

	private static Map<Long, Product> products = new HashMap<>();
	
	public static Map<Long, Product> getProducts() {
		return products;
	}
}
