package edu.cibertec.tecnomart.service;

import java.util.List;

import edu.cibertec.tecnomart.entity.Producto;

public interface ProductoService {
	public Producto insertarProducto(Producto objproducto);
	public List<Producto> listadoProducto();
	public void eliminarProducto(int idproducto);
	public Producto actualizarProducto(Producto producto);
	public Producto obtenerProducto(int idproducto);
	

}
