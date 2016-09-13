package com.soap.gabriel;

public class Teste {

	public static void main(String[] args) {
		
		ClienteService c = new ClienteService();
		
		c.salvarCliente("Gabriel");
		c.salvarCliente("Tatyana");
		c.salvarCliente("Tajla");
		c.salvarCliente("Nilton");
		
		System.out.println(c.listarClientes());
	}

}
