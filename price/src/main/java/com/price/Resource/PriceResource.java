package com.price.Resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.price.Model.Price;
import com.price.Service.PriceService;




@Path("/price")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class PriceResource {

	PriceService ps = new PriceService();
	
	@GET
	@Path("/{proId}")
	public Price getPrice(@PathParam("proId")long Id) {
		return ps.getPrice(Id);
	}
	
	@POST
	public void addPrice(Price p) {
		ps.addPrice(p);
	}
	
	@PUT
	@Path("/{proId}")
	public void updatePrice(@PathParam("proId") int Id, Price p) {
		p.setId(Id);
		ps.updatePrice(p);
	}
	
	@DELETE
	@Path("/{proId}")
	public void removePrice(@PathParam("proId") long Id) {
		ps.removePrice(Id);
	}
	
}
