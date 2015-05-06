package com.java.ex.messenger;

import java.util.ArrayList;
import java.util.List;

public class MessageService {

	public List<MessageModel> getAllMessage()
	{
		List<MessageModel> list = new ArrayList<>();
		MessageModel m1 = new MessageModel(1, "Karthik");
		MessageModel m2 = new MessageModel(2, "Lakhith");
		
		list.add(m1);
		list.add(m2);
		
		return list;
	}
}
