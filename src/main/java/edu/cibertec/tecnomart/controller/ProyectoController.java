package edu.cibertec.tecnomart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class ProyectoController {
	
	@GetMapping("/login")
    public String login() {
        return "login";
    }
	
	@GetMapping("/principal")
	public String cliente() {
		return "principal";
	}
	@GetMapping("/registrar")
	public String registro() {
		return "cliente/registroClientes";
	}

}
