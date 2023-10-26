package edu.cibertec.tecnomart.service;

import java.util.List;

import edu.cibertec.tecnomart.entity.Empleado;

public interface EmpleadoService {
	
	public String login(String user, String clave);
	
	public List<Empleado> listadoEmpleado();
	
	public Empleado obtenerEmpleadoporId(int idempleado);

}
