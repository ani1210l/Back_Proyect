package com.sinfloo.modelo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;




@javax.persistence.Entity
@javax.persistence.Table(name = "clientes")
public class Cliente {

	/**
	 * 
	 */

	@javax.persistence.Id
	@javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
	@Column
	private int id_cliente;
	@Column
	private String usuario;
	@Column
	private String password;
	
	@javax.persistence.ManyToOne
	@javax.persistence.JoinColumn(name = "id_persona")
	private Persona persona;
	
	// RELACIONES
	@javax.persistence.OneToMany(mappedBy="cliente", cascade = javax.persistence.CascadeType.ALL)
	//private List<PedidoCabecera> pedidoCabecera;
	
	public int getId_cliente() {
		return id_cliente;
	}
	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
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
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	
}
