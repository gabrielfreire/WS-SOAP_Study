package com.soap.gabriel;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public interface IClienteService {


	@WebMethod public String listarClientes();
	
	
	@WebMethod public void salvarCliente(String nome);
}
