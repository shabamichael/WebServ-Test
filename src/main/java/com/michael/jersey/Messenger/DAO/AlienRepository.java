package com.michael.jersey.Messenger.DAO;

import java.util.ArrayList;
import java.util.List;

import com.michael.jersey.Messenger.Alien;

public class AlienRepository {

	
	List<Alien> aliens;
	
	public AlienRepository()
	{
		aliens = new ArrayList<>();
		
		
		//database connection
		//Mock it up
		
		Alien A1 = new Alien();
		A1.setName("Michael");
		A1.setPoints(85);
		
		
		Alien A2 = new Alien();
		A2.setName("Shaba");
		A2.setPoints(95);
		
		aliens.add(A1);
		aliens.add(A2);
		
	}
	
	public List<Alien> getAliens()
	
	{
		return aliens;
		
	}
	
	//Fetch one object
	public  Alien getOneAlien(int id)
	{
		Alien a1 = null;
		
		for (Alien a: aliens)
		{
			if (a.getId() ==id) {
				
				return a;
			}
			
				
		}
		return null;
		
	}

	public void create(Alien a1) {
		// TODO Auto-generated method stub
		
		aliens.add(a1);
	}
}
