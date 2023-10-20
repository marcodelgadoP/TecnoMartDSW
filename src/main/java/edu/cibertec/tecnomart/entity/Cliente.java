package edu.cibertec.tecnomart.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="tb_cliente")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idcliente;
	private String nombrecli;
	private String apellidocli;
	private String direccion;
	private String telefono;
	private String email;
	private String usuario;
	private String password;
	
	public Cliente(int idcliente, String nombrecli, String apellidocli, String direccion, String telefono, String email,
			String usuario, String password) {
		super();
		this.idcliente = idcliente;
		this.nombrecli = nombrecli;
		this.apellidocli = apellidocli;
		this.direccion = direccion;
		this.telefono = telefono;
		this.email = email;
		this.usuario = usuario;
		this.password = password;
	}


	public Cliente() {
	}

	
	public String getApellidocli() {
		return apellidocli;
	}

	public void setApellidocli(String apellidocli) {
		this.apellidocli = apellidocli;
	}


	public int getIdcliente() {
		return idcliente;
	}

	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}

	public String getNombrecli() {
		return nombrecli;
	}

	public void setNombrecli(String nombrecli) {
		this.nombrecli = nombrecli;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

}
