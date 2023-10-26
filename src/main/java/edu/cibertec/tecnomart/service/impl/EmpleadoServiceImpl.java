package edu.cibertec.tecnomart.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.cibertec.tecnomart.entity.Empleado;
import edu.cibertec.tecnomart.repository.EmpleadoRepository;
import edu.cibertec.tecnomart.service.EmpleadoService;

@Service
public class EmpleadoServiceImpl implements EmpleadoService{
	
	@Autowired
	private EmpleadoRepository emprepo;
	

	@Override
	public String login(String user, String clave) {

		boolean isEmpleado = emprepo.existsByUser(user);
		if (isEmpleado) {
            return "redirect:/principal";
        } else {
            return "redirect:/login";
        }
	}


	@Override
	public List<Empleado> listadoEmpleado() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Empleado obtenerEmpleadoporId(int idempleado) {
		// TODO Auto-generated method stub
		return null;
	}}
