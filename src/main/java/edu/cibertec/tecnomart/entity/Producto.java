package edu.cibertec.tecnomart.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_producto")
public class Producto {

	@Id
	public int idproducto;
	public String modelo;
	public String descrip;
	public double precio; 
	public int stock;
	public int idmarca;
	
	@ManyToOne
	@JoinColumn(name = "idmarca", insertable = false, updatable = false)
	private Marca objMarca;
	
	
	public Producto(){
		
	}

	public Producto(int idproducto, String modelo, String descrip, double precio, int stock, int idmarca,
			Marca objMarca) {
		super();
		this.idproducto = idproducto;
		this.modelo = modelo;
		this.descrip = descrip;
		this.precio = precio;
		this.stock = stock;
		this.idmarca = idmarca;
		this.objMarca = objMarca;
	}

	public int getIdproducto() {
		return idproducto;
	}

	public void setIdproducto(int idproducto) {
		this.idproducto = idproducto;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getDescrip() {
		return descrip;
	}

	public void setDescrip(String descrip) {
		this.descrip = descrip;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getIdmarca() {
		return idmarca;
	}

	public void setIdmarca(int idmarca) {
		this.idmarca = idmarca;
	}

	public Marca getObjMarca() {
		return objMarca;
	}

	public void setObjMarca(Marca objMarca) {
		this.objMarca = objMarca;
	}
	
	
	
	
}
