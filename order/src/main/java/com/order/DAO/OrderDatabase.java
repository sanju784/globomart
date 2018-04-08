package com.order.DAO;

import java.util.HashMap;
import java.util.Map;

import com.order.Model.Order;


public class OrderDatabase {

	private static Map<Long, Order> order = new HashMap<>();
	
	public static Map<Long, Order> getOrders() {
		return order;
	}
}
