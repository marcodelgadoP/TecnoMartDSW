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
	private ClienteService servicioCliente;

	
	@GetMapping("/controlador")
	public String controlCliente(Model model) {
		
		model.addAttribute("cliente", new Cliente());
		
		return "cliente/registroClientes";
	}
	
	@PostMapping("/registro")
	public String ingresarCliente(@ModelAttribute Cliente cliente, Model model) {
		
		model.addAttribute("cliente", new Cliente());
		servicioCliente.insertarCliente(cliente);
		return "cliente/registroClientes";
	}
	
	@GetMapping("/listado")
	public String listadoCliente(Model model) {
	    List<Cliente> clientes = servicioCliente.listadoCliente();
	    model.addAttribute("clientes", clientes);
	    return "cliente/listadoClientes";
	}
	
	
	@PostMapping("/eliminar")
	public String eliminarCliente(@RequestParam("idcliente") int idcliente, Model model) {
	


		try {
			servicioCliente.eliminarCliente(idcliente);
			System.out.println("SE ELIMINO CORRECTAMENTE");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    List<Cliente> clientes = servicioCliente.listadoCliente();
	    model.addAttribute("clientes", clientes);
	    
	   return "cliente/listadoClientes";
	   
	}
	
	
	@PostMapping("/obtenerid")
	public String obtenerIdCliente(@RequestParam("idcliente") int idcliente, Model model) {
	
		model.addAttribute("cliente", servicioCliente.obtenerCliente(idcliente));
	    System.out.println("El codigo recogido es: " + idcliente);
	    
	   return "cliente/actualizarCliente";
	}
	
	@PostMapping("/actualizar")
	public String actualizacionCliente(@ModelAttribute Cliente cliente, @RequestParam("idcliente") int idcliente ,Model model) {
		try {
			model.addAttribute("cliente", servicioCliente.actualizarCliente(cliente));
			System.out.println("El codigo recogido es: " + idcliente);
			
		} catch (Exception e) {
			System.out.println("El codigo recogido es: " + e);
		}
		
	    List<Cliente> clientes = servicioCliente.listadoCliente();
	    model.addAttribute("clientes", clientes);
		
		return "cliente/listadoClientes";
	}
	

}
