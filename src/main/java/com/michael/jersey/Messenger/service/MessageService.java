package com.michael.jersey.Messenger.service;

import java.util.ArrayList;
import java.util.List;

import com.michael.jersey.Messenger.model.Message;

public class MessageService {
	
	public List<Message> getAllMessages(){
		
		Message m1 = new Message(1L, "Hello Mikkkky", "Michael");
		Message m2 = new Message(2L, "yebo Mikkkky", "Shaba");
		
		List<Message> list = new ArrayList<>();
		list.add(m1);
		list.add(m2);
		
		return list;
		
	}

}
