package edu.cibertec.tecnomart.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.cibertec.tecnomart.entity.Producto;
import edu.cibertec.tecnomart.repository.ProductoRepository;
import edu.cibertec.tecnomart.service.ProductoService;

@Service
public class ProductoServiceImpl  implements ProductoService {

	@Autowired
	private ProductoRepository repoProd;
	
	@Override
	public Producto insertarProducto(Producto producto) {
		// TODO Auto-generated method stub
		return repoProd.save(producto);
	}

	@Override
	public List<Producto> listadoProducto() {
		// TODO Auto-generated method stub
		return repoProd.findAll();
	}

	@Override
	public void eliminarProducto(int idproducto) {
		// TODO Auto-generated method stub
		repoProd.deleteById(idproducto);
	}

	@Override
	public Producto actualizarProducto(Producto producto) {
		Producto produc = repoProd.findById(producto.getIdproducto()).orElse(null);
		if(produc !=null) {
			produc.setIdproducto(producto.getIdproducto());
			produc.setModelo(producto.getModelo());
			produc.setDescrip(producto.getDescrip());
			produc.setPrecio(producto.getPrecio());
			produc.setStock(producto.getStock());
			produc.setIdmarca(producto.getIdmarca());
			
			repoProd.save(produc);
		}
		return repoProd.save(produc);
	}

	@Override
	public Producto obtenerProducto(int idproducto) {
		// TODO Auto-generated method stub
		return repoProd.findById(idproducto).orElse(null);
	}

}
