package com.sinfloo.modelo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="categorias")
public class Categoria implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_categoria;
	@Column

	private String nombre;
	@Column

	private String tipo;
	
	

	// RELACIONES
		@OneToMany(mappedBy="categoria", cascade = CascadeType.ALL)
		private List<Producto> producto;
		
		
		
	public Long getId_categoria() {
		return id_categoria;
	}
	public void setId_categoria(long id) {
		this.id_categoria = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	

}


	
	
	

