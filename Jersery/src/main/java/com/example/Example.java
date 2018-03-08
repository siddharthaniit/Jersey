package com.example;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

public class Example {
	
	public static void main(String[] args) {
		
		Client newClient = ClientBuilder.newClient();
		WebTarget target = newClient.target(UriBuilder.fromUri("https://api.fixer.io/latest"));
		Builder request = target.request();
		Response response = request.get();
		String readEntity = response.readEntity(String.class);
		System.out.println(readEntity);
		
		
	}	
	

}
