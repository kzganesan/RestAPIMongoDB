package com.java.ex.messenger;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class MongoDBModel {

	private long collId;
	private String collName;
	
	public MongoDBModel()
	{
	
	}
	
	public MongoDBModel(long collId, String collName)
	{
		this.collId = collId;
		this.collName = collName;		
	}
	
	public long getCollId()
	{
		return collId;
	}
	
	public String getCollName()
	{
		return collName;
	}
	
	public void setCollId(long collId)
	{
		this.collId = collId;
	}
	
	public void setCollName(String collName)
	{
		this.collName = collName;
	}
}
