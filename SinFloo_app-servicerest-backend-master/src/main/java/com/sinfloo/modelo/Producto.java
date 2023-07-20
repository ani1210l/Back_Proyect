package com.sinfloo.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.sinfloo.modelo.Categoria;
@Table(name = "Producto")
@Entity

public class Producto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int IdProducto;
	@Column
	private String prod_cod;
	@Column
	private int  prod_catidad;
	@Column
	private String prod_descripcion;
	@Column
	private Double prod_precio;
	@Column
	private Byte prod_img;
	
	@ManyToOne
	@JoinColumn(name = "id_categoria")
	private Categoria categoria;
	
		public int getIdProducto() {
		return IdProducto;
	}
	public void setIdProducto(int idProducto) {
		IdProducto = idProducto;
	}
	public String getProd_cod() {
		return prod_cod;
	}
	public void setProd_cod(String prod_cod) {
		this.prod_cod = prod_cod;
	}
	public int getProd_catidad() {
		return prod_catidad;
	}
	public void setProd_catidad(int prod_catidad) {
		this.prod_catidad = prod_catidad;
	}
	public String getProd_descripcion() {
		return prod_descripcion;
	}
	public void setProd_descripcion(String prod_descripcion) {
		this.prod_descripcion = prod_descripcion;
	}
	public Byte getProd_img() {
		return prod_img;
	}
	public void setProd_img(Byte prod_img) {
		this.prod_img = prod_img;
	}
	public Double getProd_precio() {
		return prod_precio;
	}
	public void setProd_precio(Double prod_precio) {
		this.prod_precio = prod_precio;
	}
	

	
	

}
