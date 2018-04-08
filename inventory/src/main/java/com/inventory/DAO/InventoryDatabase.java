package com.inventory.DAO;

import java.util.HashMap;
import java.util.Map;

import com.inventory.Model.Inventory;



public class InventoryDatabase {

	private static Map<Long, Inventory> inventory = new HashMap<>();
	
	public static Map<Long, Inventory> getTotal() {
		return inventory;
	}
}
