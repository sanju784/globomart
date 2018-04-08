package com.inventory.Service;

import java.util.Map;

import com.inventory.DAO.InventoryDatabase;
import com.inventory.Model.Inventory;



public class InventoryService {
	private Map<Long,Inventory> Inventorys = InventoryDatabase.getTotal();
	public InventoryService() {
		
		Inventory p1 = new Inventory(1, 2);
		Inventory p2 = new Inventory(2, 3);
		Inventory p3 = new Inventory(3, 4);
		
		Inventorys.put(1L, p1);
		Inventorys.put(1L, p2);
		Inventorys.put(1L, p3);
	} 
	
    public void addInventory(Inventory i) {
    	i.setId(Inventorys.size()+1);
		Inventorys.put((long) i.getId(), i);
    }
	
	public Inventory getTotal(Long id) {
		return Inventorys.get(id);
	}
	
	public void addToInventory(Inventory p, int n) {
		p.setId(Inventorys.size());
		p.setTotal(p.getTotal() + n);
		Inventorys.put((long) p.getId(), p);
	}
	
	public void deleteFromInventory(Inventory p, int n) {
		
		p.setId(Inventorys.size());
		p.setTotal(p.getTotal() - n);
		Inventorys.put((long) p.getId(), p);
	}
	
	public void removeInventory(long id) {
		Inventorys.remove(id);
	}
}
