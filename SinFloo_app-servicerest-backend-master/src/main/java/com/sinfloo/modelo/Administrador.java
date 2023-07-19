package com.sinfloo.modelo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name="administradores")
@Entity
public class Administrador {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column
private int id_administrador;
@Column
private String pasword;
@Column
private String usuario;


@ManyToOne
@JoinColumn(name = "id_persona")
private Persona persona;


public Administrador() {
	super();
}

public int getId_administrador() {
	return id_administrador;
}

public void setId_administrador(int id_administrador) {
	this.id_administrador = id_administrador;
}

public String getPasword() {
	return pasword;
}

public void setPasword(String pasword) {
	this.pasword = pasword;
}

public String getUsuario() {
	return usuario;
}

public void setUsuario(String usuario) {
	this.usuario = usuario;
}

public Persona getPersona() {
	return persona;
}

public void setPersona(Persona persona) {
	this.persona = persona;
}




}

