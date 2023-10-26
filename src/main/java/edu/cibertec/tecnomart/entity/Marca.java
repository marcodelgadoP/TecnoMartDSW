package edu.cibertec.tecnomart.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_marca")
public class Marca {
	
	@Id
	public int idmarca;
	public String nombremarca;
	
	public Marca() {
		
	}

	public Marca(int idmarca, String nombremarca) {
		super();
		this.idmarca = idmarca;
		this.nombremarca = nombremarca;
	}

	public int getIdmarca() {
		return idmarca;
	}

	public void setIdmarca(int idmarca) {
		this.idmarca = idmarca;
	}

	public String getNombremarca() {
		return nombremarca;
	}

	public void setNombremarca(String nombremarca) {
		this.nombremarca = nombremarca;
	}
	


}
