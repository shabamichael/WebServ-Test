package com.michael.jersey.Messenger;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("aliens")
public class AlienResource 
{
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Alien> getAlien() 
	{
		
		System.out.println("Called the Get Alien Resources...");
		Alien A1 = new Alien();
		A1.setName("Michael");
		A1.setPoints(85);
		
		
		Alien A2 = new Alien();
		A2.setName("Shaba");
		A2.setPoints(95);
		
		List<Alien> aliens = Arrays.asList(A1,A2);
		System.out.println(aliens);
		
		return aliens;
		
		
	}

}
