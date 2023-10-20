package edu.cibertec.tecnomart.service;

import java.util.List;

import edu.cibertec.tecnomart.entity.Cliente;



public interface ClienteService {
	
	public Cliente insertarCliente(Cliente objCliente);
	public List<Cliente> listadoCliente();
	public void eliminarCliente(int idcliente); 
	public Cliente actualizarCliente(Cliente cliente);
	public Cliente obtenerCliente(int idcliente);

}
