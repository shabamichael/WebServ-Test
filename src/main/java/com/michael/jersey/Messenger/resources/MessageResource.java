package com.michael.jersey.Messenger.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.michael.jersey.Messenger.model.Message;
import com.michael.jersey.Messenger.service.MessageService;

@Path("/messages")
public class MessageResource {

	
	
	MessageService messageService = new MessageService();
	
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Message> getMessages() {
		
		
		System.out.println("Message List");
		return messageService.getAllMessages();
	}
}
