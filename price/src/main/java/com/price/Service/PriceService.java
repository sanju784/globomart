package com.price.Service;

import java.util.Map;

import com.price.DAO.PriceDatabase;
import com.price.Model.Price;



public class PriceService {
	private Map<Long,Price> price = PriceDatabase.getPrice();
	public PriceService() {
		
		Price p1 = new Price(1, 1);
		Price p2 = new Price(2, 2);
		Price p3 = new Price(3, 3);
		
		price.put(1L, p1);
		price.put(1L, p2);
		price.put(1L, p3);
	} 
	
	public Price getPrice(Long id) {
		return price.get(id);
	}
	
	public void addPrice(Price p) {
		p.setId(price.size()+1);
		price.put((long) p.getId(), p);
	}
	
	public void updatePrice(Price p) {
		price.put((long) p.getId(), p);
	}
	
	public void removePrice(long id) {
		price.remove(id);
	}
}
