package edu.cibertec.tecnomart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.cibertec.tecnomart.entity.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {

}
