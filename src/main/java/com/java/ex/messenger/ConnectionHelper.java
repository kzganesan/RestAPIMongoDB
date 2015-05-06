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
import com.mongodb.MongoClient;
import com.mongodb.util.JSON;

public class ConnectionHelper
{
	//private String url;
	//private static ConnectionHelper instance;
 	
	public ConnectionHelper()
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
	
	public static DB getMongoDB()
	{	
		DB mongodb;
		
		try {
			MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
		     // Now connect to your databases
		     mongodb = mongoClient.getDB( "test" );
		     System.out.println("Connect to database successfully");
		     
		} catch (SQLException e) {
			throw e;
		}
		
		return mongodb;
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
	
	public static Set<String> getCollectionNames(DB mongodb)
	{
		Set<String> colls;
		
		try {
			colls = mongodb.getCollectionNames();
			
			for (String s : colls) {
			    System.out.println(s);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return colls;
	}
	
}