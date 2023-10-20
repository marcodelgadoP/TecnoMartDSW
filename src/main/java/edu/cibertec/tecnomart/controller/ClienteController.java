package edu.cibertec.tecnomart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;
import edu.cibertec.tecnomart.entity.Cliente;
import edu.cibertec.tecnomart.service.ClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
	
	@Autowired
	private ClienteService serviceCliente;
	
	@GetMapping
	public List<Cliente>listarCliente() {
		return serviceCliente.listadoCliente();
	}
	
	@PostMapping("/registro")
	@ResponseBody
	public Cliente registrarCliente(@RequestBody Cliente cliente) {
		return serviceCliente.insertarCliente(cliente);
	}
	
	@PostMapping("/eliminar")
	public String eliminarCliente(@RequestParam("idcliente") int idcliente, Model model) {
		try {
			serviceCliente.eliminarCliente(idcliente);
			System.out.println("Se elimino el cliente");
		} catch (Exception e) {
			e.printStackTrace();
		}
	    List<Cliente> clientes = serviceCliente.listadoCliente();
	    model.addAttribute("clientes", clientes);
	   return "cliente/listado";
	   
	}
	
	@PostMapping("/obtenerid")
	public String obtenerIdCliente(@RequestParam("idcliente") int idcliente, Model model) {
	
		model.addAttribute("cliente", serviceCliente.obtenerCliente(idcliente));
	    System.out.println("El codigo es " + idcliente);
	    
	   return "cliente/actualizar";
	}
	
	@PutMapping("/actualizar")
	@ResponseBody
	public Cliente actualizacionCliente(@RequestBody Cliente cliente) {
		return serviceCliente.actualizarCliente(cliente);
	}
	

}
