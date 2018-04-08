package com.order.Service;

import java.util.Map;

import com.order.DAO.OrderDatabase;
import com.order.Model.Order;



public class OrderService {
	private Map<Long,Order> orders = OrderDatabase.getOrders();
	public OrderService() {
		
	} 
	
	public void placeOrder(int id, int n) {
		
	}

}
