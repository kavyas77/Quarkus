package org.acme;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.inject.Inject;
import jakarta.ws.rs.QueryParam;

@Path("/greeting")
public class GreetingResource {
	
	@Inject
	GreetingService service;

    @GET
    
    public String greet(@QueryParam("name")String name) {
        return service.getGreeting(name != null ? name:"World");
    }
}
