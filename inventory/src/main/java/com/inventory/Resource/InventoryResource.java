package com.inventory.Resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.inventory.Model.Inventory;
import com.inventory.Service.InventoryService;


@Path("/inventory")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class InventoryResource {

	InventoryService ps = new InventoryService();
	
	
	@GET
	@Path("/{id}")
	public Inventory getInventory(@PathParam("id")long Id) {
		return ps.getTotal(Id);
	}
	
	@PUT
	@Path("/add/{n}")
	public void addInventory(@PathParam("n") int n, Inventory i) {
		ps.addToInventory(i,n);
	}
	
	@PUT
	@Path("/delete/{n}")
	public void updateInventory(@PathParam("n") int n, Inventory i) {
		ps.deleteFromInventory(i, n);
	}
	
	@POST
	public void addInventory(Inventory i) {
		ps.addInventory(i);
	}
	
	@DELETE
	@Path("/{Id}")
	public void deleteInventory(@PathParam("Id") long Id) {
		ps.removeInventory(Id);
	}
	
}
