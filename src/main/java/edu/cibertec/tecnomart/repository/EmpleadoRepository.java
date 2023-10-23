package edu.cibertec.tecnomart.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import edu.cibertec.tecnomart.entity.Empleado;

public interface EmpleadoRepository extends JpaRepository<Empleado, Integer> {
	Empleado findByUser(String user);
}
