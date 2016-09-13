package com.soap.gabriel;

import javax.jws.WebService;

//WebService implementation

@WebService(endpointInterface = "com.soap.gabriel.IClienteService")
public class ClienteService implements IClienteService {
	
	private ClienteRepository clienteRepository;
	
	public ClienteService(){
		this.clienteRepository = new ClienteRepository();
	}
	/*
	 * Gettin' the Array from the Repo and formatting into a String to show on console
	 * p.s. I did this for testing purposes
	 */
	@Override
	public String listarClientes(){
		Cliente[] clientes = clienteRepository.listClientes();
		String m = "Clientes: \nCódigo  Nome\n";
		for(int i = 0; i < clientes.length; i++){
			m += clientes[i].getCodigo() + ":   " + clientes[i].getNome() + "\n";
		}
		
		return m;
	}
	@Override
	public void salvarCliente(String nome){
		clienteRepository.save(nome);
	}
}
