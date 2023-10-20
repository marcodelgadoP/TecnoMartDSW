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
	private ClienteRepository clienterepo;

	@Override
	public Cliente insertarCliente(Cliente objCliente) {
		// TODO Auto-generated method stub
		return clienterepo.save(objCliente);
	}

	@Override
	public List<Cliente> listadoCliente() {
		// TODO Auto-generated method stub
		return clienterepo.findAll();
	}

	@Override
	public void eliminarCliente(int idcliente) {
		// TODO Auto-generated method stub
		clienterepo.deleteById(idcliente);
		
	}

	@Override
	public Cliente actualizarCliente(Cliente objCliente) {
		Cliente objClienteAct=clienterepo.findById(objCliente.getIdcliente()).orElse(null);
		objClienteAct.setNombrecli(objCliente.getNombrecli());
		objClienteAct.setApellidocli(objCliente.getApellidocli());
		objClienteAct.setDireccion(objCliente.getDireccion());
		objClienteAct.setTelefono(objCliente.getTelefono());
		objClienteAct.setEmail(objCliente.getEmail());
		objClienteAct.setUsuario(objCliente.getUsuario());
		objClienteAct.setPassword(objCliente.getPassword());
		return clienterepo.save(objCliente);
	}

	@Override
	public Cliente obtenerCliente(int idcliente) {
		// TODO Auto-generated method stub
		return clienterepo.findById(idcliente).orElse(null);
	}

}
