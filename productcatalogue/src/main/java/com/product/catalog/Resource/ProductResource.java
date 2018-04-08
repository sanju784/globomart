package com.product.catalog.Resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


import com.product.catalog.Model.Product;
import com.product.catalog.Service.ProductService;

@Path("/product")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ProductResource {

	ProductService ps = new ProductService();
	
	@GET
	public List<Product> getProducts() {
		return ps.getAllProduct();
	}
	
	@GET
	@Path("/{proId}")
	public Product getProduct(@PathParam("proId")long Id) {
		return ps.getProduct(Id);
	}
	
	@POST
	public void addProduct(Product p) {
		ps.addProduct(p);
	}
	
	@PUT
	@Path("/{proId}")
	public void updateProduct(@PathParam("proId") int Id, Product p) {
		p.setId(Id);
		ps.updateProduct(p);
	}
	
	@DELETE
	@Path("/{proId}")
	public void deleteProduct(@PathParam("proId") long Id) {
		ps.removeProduct(Id);
	}
	
}
