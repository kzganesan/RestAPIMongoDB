package com.java.ex.messenger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.Set;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import com.mongodb.util.JSON;

public class MongoDBConnection
{
	//private String url;
	//private static ConnectionHelper instance;
 	
	public MongoDBConnection()
	{
		/*
	// try{   
	     // To connect to mongodb server
	     MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
	     // Now connect to your databases
	     DB mongodb = mongoClient.getDB( "test" );
	     System.out.println("Connect to database successfully");
	     
	     Set<String> colls = mongodb.getCollectionNames();
		
 		for (String s : colls) {
 		    System.out.println(s);
 		}
 		*/
         //boolean auth = db.authenticate(myUserName, myPassword);
         /*
         System.out.println("Authentication: "+auth);
      }catch(Exception e){
         System.err.println( e.getClass().getName() + ": " + e.getMessage() );
      }
	 
	
	public Set<String> getCollectionNames(){
		
		MongoClient mongoClient = mongoClientProvider.getMongoClient();
		
		DB db = mongoClient.getDB("myMongoDB");		
		Set<String> colls = db.getCollectionNames();
		
		for (String s : colls) {
		    System.out.println(s);
		}		
		
		return colls;
		
    	String driver = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			url = "jdbc:mysql://localhost/directory?user=root";
            ResourceBundle bundle = ResourceBundle.getBundle("cellar");
            driver = bundle.getString("jdbc.driver");
            Class.forName(driver);
            url=bundle.getString("jdbc.url");
		} catch (Exception e) {
			e.printStackTrace();
		}
		*/
	}

	/*
	public static Connection getConnection() throws SQLException {
		if (instance == null) {
			instance = new ConnectionHelper();
		}
		try {
			return DriverManager.getConnection(instance.url);
		} catch (SQLException e) {
			throw e;
		}
	}
	*/
	
	public DB getMongoDB()
	{				
		//try {
			
			MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
		     // Now connect to your databases
		     DB mongodb = mongoClient.getDB( "test" );
		     System.out.println("Connect to database successfully");
		     
		     return mongodb;
		     
		//} catch (SQLException e) {
		//	throw e;
		//}
		
		
	}
	
	/*
	public static void close(Connection connection)
	{
		try {
			if (connection != null) {
				connection.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	 */
	
	public Set<String> getCollectionNames(DB mongodb)
	{
		Set<String> colls;
		
		//try {
			colls = mongodb.getCollectionNames();
			
			for (String s : colls) {
			    System.out.println(s);
			}
		//} catch (SQLException e) {
		//	e.printStackTrace();
		//}


		return colls;
	}
	
	public DBCollection getCollection(DB mongodb, String collectionName)
	{
		DBCollection table = mongodb.getCollection(collectionName);

		return table;
	}
	
	public void insertData(DBCollection coll, BasicDBObject document)
	{
		/*
		BasicDBObject document = new BasicDBObject();
		document.put("name", "mkyong");
		document.put("age", 30);
		document.put("createdDate", new Date());
		*/
		
		coll.insert(document);
	}
	
	public void updateData(DBCollection coll, BasicDBObject searchQuery, BasicDBObject newDocument)
	{
		/*
		BasicDBObject query = new BasicDBObject();
		query.put("name", "mkyong");
	 
		BasicDBObject newDocument = new BasicDBObject();
		newDocument.put("name", "mkyong-updated");
		*/
		BasicDBObject updateObj = new BasicDBObject();
		updateObj.put("$set", newDocument);
	 
		coll.update(searchQuery, updateObj);
	}

	public void searchData(DBCollection coll, BasicDBObject searchQuery)
	{
		/*
		BasicDBObject searchQuery = new BasicDBObject();
		searchQuery.put("name", "mkyong");
		*/
		
		DBCursor cursor = coll.find(searchQuery);
	 
		while (cursor.hasNext()) {
			System.out.println(cursor.next());
		}
	}
	
	public void removeData(DBCollection coll, BasicDBObject searchQuery)
	{
		/*
		BasicDBObject searchQuery = new BasicDBObject();
		searchQuery.put("name", "mkyong");
		 */
		
		coll.remove(searchQuery);
	}
}