package com.project.rest.index;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
@Path("/v1/index/*")

public class V1_Index {

	private static final String api_version="11.01.36";	
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String returnTitle(){
		return "<p>Java Web Service index</p>";
	}
	
	@Path("/no")
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String returnVersion(){
		return "<p>index:</p>"+api_version;
	}
}
