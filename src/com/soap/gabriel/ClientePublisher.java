package com.soap.gabriel;

import javax.xml.ws.Endpoint;

//Endpoint Publisher
public class ClientePublisher {

	
	public static void main(String[] args){
		Endpoint.publish("http://localhost:8080/cliente", new ClienteService());
	}
}
