package edu.cibertec.tecnomart.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProyectoController {
	
	@RequestMapping("/")
	String home() {
		return "Hello Word";
	}

}
