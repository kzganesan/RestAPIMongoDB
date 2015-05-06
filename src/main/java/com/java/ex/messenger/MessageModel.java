package com.java.ex.messenger;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class MessageModel {

	private long msgid;
	private String message;
	
	public MessageModel()
	{
	
	}
	
	public MessageModel(long msgid, String message)
	{
		this.msgid = msgid;
		this.message = message;		
	}
	
	public long getId()
	{
		return msgid;
	}
	
	public String getMessage()
	{
		return message;
	}
	
	public void setId(long msgid)
	{
		this.msgid = msgid;
	}
	
	public void setMessage(String message)
	{
		this.message = message;
	}
}
