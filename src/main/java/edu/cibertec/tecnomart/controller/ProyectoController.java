package edu.cibertec.tecnomart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class ProyectoController {
	
	@GetMapping("/principal")
	public String cliente() {
		return "principal.html";
	}
	
	@GetMapping("/registrar")
	public String registro() {
		return "cliente/registroClientes.html";
	}

}
