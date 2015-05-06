package com.java.ex.messenger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import java.util.List;

@Path("message")
public class Message {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
	
	MessageService messageService = new MessageService();
		
    @GET    
    @Produces(MediaType.APPLICATION_JSON)
    public List<MessageModel> getIt() {
        return messageService.getAllMessage();
    }
    
    @GET
    @Path("/test")
    @Produces(MediaType.TEXT_HTML)
    public String getTest() {
        return "Test";
    }
}
