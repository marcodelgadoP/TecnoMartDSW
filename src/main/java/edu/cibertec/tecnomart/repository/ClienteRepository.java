package edu.cibertec.tecnomart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.cibertec.tecnomart.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
