package com.michael.jersey.Messenger;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.michael.jersey.Messenger.DAO.AlienRepository;

@Path("aliens")
public class AlienResource 
{
	
	AlienRepository repo = new AlienRepository();
	
	
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Alien> getAlien() 
	{
		
		System.out.println("Called the Get Alien Resources...");
		
		Alien A1 = new Alien();
		A1.setId(10);
		A1.setName("Michael");
		A1.setPoints(44);
		
		System.out.println(A1.getId());
		
		
		Alien A2 = new Alien();
		A2.setId(11);
		A2.setName("Shaba");
		A2.setPoints(229);
		
		System.out.println(A2.getId());
		List<Alien> aliens = Arrays.asList(A1,A2);
		
		
		return repo.getAliens();
		
	}

	@POST
	@Path("alien")
	public Alien createAlien(Alien a1)
	
	{
		System.out.println(a1.getId());
		System.out.println(a1);
		repo.create(a1);
		return a1;
		
	}
}
