package com.product.catalog.Service;

import java.util.List;
import java.util.Map;

import com.product.catalog.DAO.ProductDatabase;
import com.product.catalog.Model.Product;

public class ProductService {
	private Map<Long,Product> products = ProductDatabase.getProducts();
	public ProductService() {
		
		Product p1 = new Product(1, "Apple");
		Product p2 = new Product(2, "Banana");
		Product p3 = new Product(3, "Grape");
		
		products.put(1L, p1);
		products.put(1L, p2);
		products.put(1L, p3);
	} 
	
	public List<Product> getAllProduct() {
		List<Product> list = (List<Product>) products.values();
		return list;
	}
	
	public Product getProduct(Long id) {
		return products.get(id);
	}
	
	public void addProduct(Product p) {
		p.setId(products.size()+1);
		products.put((long) p.getId(), p);
	}
	
	public void updateProduct(Product p) {
		products.put((long) p.getId(), p);
	}
	
	public void removeProduct(long id) {
		products.remove(id);
	}
}
