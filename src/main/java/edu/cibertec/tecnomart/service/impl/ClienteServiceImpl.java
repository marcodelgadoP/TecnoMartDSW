package edu.cibertec.tecnomart.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.cibertec.tecnomart.entity.Cliente;
import edu.cibertec.tecnomart.repository.ClienteRepository;
import edu.cibertec.tecnomart.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {
	@Autowired
	private ClienteRepository repoCli;
	
	@Override
	public Cliente insertarCliente(Cliente objCliente) {
		return repoCli.save(objCliente);
	}

	@Override
	public List<Cliente> listadoCliente(){
		return repoCli.findAll();
	}

	@Override
	public void eliminarCliente(int idcliente) {
		
		repoCli.deleteById(idcliente);
	}

	@Override
	public Cliente actualizarCliente(Cliente cliente) {
		
		Cliente client = repoCli.findById(cliente.getIdcliente()).orElse(null);
		if (client != null) {
			client.setIdcliente(cliente.getIdcliente());
			client.setNomcliente(cliente.getNomcliente());
			client.setApecliente(cliente.getApecliente());
			client.setTelefono(cliente.getTelefono());
			client.setEmail(cliente.getEmail());
			client.setPassword(client.getPassword());
          
            repoCli.save(client);
        }
		return repoCli.save(client);
	}

	@Override
	public Cliente obtenerCliente(int idcliente) {
		
		return repoCli.findById(idcliente).orElse(null);
	}

}
