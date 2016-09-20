package com.mann.rest.rest;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/v1/status")

public class V1_status {
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String returnTitle() {
		return "<p> My java Web Service<p>";
	}

}
