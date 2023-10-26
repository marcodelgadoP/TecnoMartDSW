package edu.cibertec.tecnomart.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import edu.cibertec.tecnomart.service.EmpleadoService;

@Controller
public class EmpleadoController {
	
	@Autowired
	private EmpleadoService empservice;
		
	@PostMapping("/login")
    public String login(@RequestParam("user") String user, 
                        @RequestParam("clave") String clave) {
        String redirectPage = empservice.login(user, clave);
        
        return redirectPage;
    }
}