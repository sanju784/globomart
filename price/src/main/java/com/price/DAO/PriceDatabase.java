package com.price.DAO;

import java.util.HashMap;
import java.util.Map;

import com.price.Model.Price;


public class PriceDatabase {

	private static Map<Long, Price> price = new HashMap<>();
	
	public static Map<Long, Price> getPrice() {
		return price;
	}
}
