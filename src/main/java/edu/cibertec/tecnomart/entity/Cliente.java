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
	private String nomcliente;
	private String apecliente;
	private String direcliente;
	private String telefono;
	private String email;
	private String password;
	
	public Cliente() {
	}
	
	public Cliente(int idcliente, String nomcliente, String apecliente, String direcliente, String telefono,
			String email, String password) {
		super();
		this.idcliente = idcliente;
		this.nomcliente = nomcliente;
		this.apecliente = apecliente;
		this.direcliente = direcliente;
		this.telefono = telefono;
		this.email = email;
		this.password = password;
	}
	public int getIdcliente() {
		return idcliente;
	}
	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}
	public String getNomcliente() {
		return nomcliente;
	}
	public void setNomcliente(String nomcliente) {
		this.nomcliente = nomcliente;
	}
	public String getApecliente() {
		return apecliente;
	}
	public void setApecliente(String apecliente) {
		this.apecliente = apecliente;
	}
	public String getDirecliente() {
		return direcliente;
	}
	public void setDirecliente(String direcliente) {
		this.direcliente = direcliente;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

	

}
