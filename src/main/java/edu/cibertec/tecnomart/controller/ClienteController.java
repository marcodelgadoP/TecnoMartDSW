package edu.cibertec.tecnomart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;
import edu.cibertec.tecnomart.entity.Cliente;
import edu.cibertec.tecnomart.service.ClienteService;

@Controller
@RequestMapping("/cliente")
public class ClienteController {
	

	@Autowired
	private ClienteService serviceCliente;


	/*
	@GetMapping("/controlador")
	
	@GetMapping("/controlador") 
	public String controlCliente(Model model) {		
		model.addAttribute("cliente", new Cliente());
		return "cliente/registroClientes";
	}*/
	
	@GetMapping("/ir/registro")
	public String irRegistroCliente(Model model) {
		model.addAttribute("cliente", new Cliente());
		return "cliente/registroClientes";
	}
	
	@PostMapping("/registro")
	public String ingresarCliente(@ModelAttribute Cliente cliente, Model model) {
		model.addAttribute("cliente", new Cliente());
		serviceCliente.insertarCliente(cliente);
		return "cliente/registroClientes";
	}
	
	@GetMapping("/listado")
	public String listadoCliente(Model model) {
	    List<Cliente> clientes = serviceCliente.listadoCliente();
	    model.addAttribute("clientes", clientes);
	    return "cliente/listadoClientes";
	}
		
	@PostMapping("/eliminar")
	public String eliminarCliente(@RequestParam("idcliente") int idcliente, Model model) {
		try {
			serviceCliente.eliminarCliente(idcliente);
			System.out.println("se elimino el cliente");
		} catch (Exception e) {
			e.printStackTrace();
		}
	    List<Cliente> clientes = serviceCliente.listadoCliente();
	    model.addAttribute("clientes", clientes);	    
	   return "cliente/listadoClientes";  
	}	
	
	@PostMapping("/obtenerid")
	public String obtenerIdCliente(@RequestParam("idcliente") int idcliente, Model model) {
	
		model.addAttribute("cliente", serviceCliente.obtenerCliente(idcliente));
	    System.out.println("El codigo es:" + idcliente);
	    
	   return "cliente/actualizarCliente";
	}
	
	@PostMapping("/actualizar")
	public String actualizacionCliente(@ModelAttribute Cliente cliente, @RequestParam("idcliente") int idcliente ,Model model) {
		try {
			model.addAttribute("cliente", serviceCliente.actualizarCliente(cliente));
			System.out.println("el codigo es:" + idcliente);
			
		} catch (Exception e) {
			System.out.println("El codigo es:" + e);
		}
		
	    List<Cliente> clientes = serviceCliente.listadoCliente();
	    model.addAttribute("clientes", clientes);
		
		return "cliente/listadoClientes";
	}
	

}
