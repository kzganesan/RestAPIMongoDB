package com.java.ex.messenger;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.mongodb.DB;

public class MongoDBService {

	MongoDBConnection mongoDBConnection = new MongoDBConnection();
	
	public List<MongoDBModel> getAllCollections()
	{
		List<MongoDBModel> list = new ArrayList<>();
		
		DB mongodb = mongoDBConnection.getMongoDB();
		Set<String> colls = mongoDBConnection.getCollectionNames(mongodb);
		int i = 0;
		
		for (String s : colls) {
		    System.out.println(s);
		    
		    i = i + 1;
		    MongoDBModel m1 = new MongoDBModel(i, s);
		    list.add(m1);
		}
		
		//MongoDBModel m1 = new MongoDBModel(1, "Karthik");
		//MessageModel m2 = new MessageModel(2, "Lakhith");
		
		//list.add(m1);
		//list.add(m2);
		
		return list;
	}
}
