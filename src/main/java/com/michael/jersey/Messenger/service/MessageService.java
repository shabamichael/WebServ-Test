package com.michael.jersey.Messenger.service;

import java.util.ArrayList;
import java.util.List;

import com.michael.jersey.Messenger.model.Message;

public class MessageService {
	
	public List<Message> getAllMessages(){
		
		Message m1 = new Message(1L, "Yebo  Michael", "Michael");
		Message m2 = new Message(2L, "yebo Mike", "Shaba");
		Message m3 =  new Message(3L, "Idorenyin", "Akpabio");
		
		List<Message> list = new ArrayList<>();
		list.add(m1);
		list.add(m2);
		list.add(m3);
		
		return list;
		
	}

}
