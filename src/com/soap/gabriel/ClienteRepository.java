package com.soap.gabriel;

import java.util.ArrayList;
import java.util.List;


public class ClienteRepository {
	private List<Cliente> clientes = new ArrayList<>();
	
	public ClienteRepository(){
		
	}

	public String save(String nome){
		Cliente addedCliente = new Cliente(nome);
		this.clientes.add(addedCliente);
		System.out.println("added : " + addedCliente.getNome());
		return "Cliente adicionado : " + addedCliente.getNome();
	}
	/*
	 * The List interface must be transformed into a Array of Cliente in order to JAXB work
	 * JAXB doesn't support interfaces! FUCK! 
	 */
	public Cliente[] listClientes(){
		Cliente[] ar = new Cliente[clientes.size()];
		int i = 0;
		for(Cliente c: clientes){
			ar[i] = c;
			i++;
		}	
		return ar;
	}
}
