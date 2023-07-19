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
import javax.persistence.UniqueConstraint;



@Entity
@Table(name = "pedidoDetalles", uniqueConstraints = {@UniqueConstraint(columnNames ={"id_pedidoC", "id_producto"})})

public class PedidoDetalle {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id_pedidoDetalle;
	@Column
	private Integer Cantidad;
	@Column
	private Double total;
	
	// RELACIONES
	@OneToMany(mappedBy="pedidoDetalle", cascade = CascadeType.ALL)
	private List<FacturaDetalle> facturaDetalle;
	
	
	@ManyToOne
	@JoinColumn(name = "id_pedidoC")
	private PedidoCabecera pedidoCabecera;
	
	
	@ManyToOne
	@JoinColumn(name = "id_producto")
	private Producto producto;


	public int getId_pedidoDetalle() {
		return id_pedidoDetalle;
	}


	public void setId_pedidoDetalle(int id_pedidoDetalle) {
		this.id_pedidoDetalle = id_pedidoDetalle;
	}


	public Integer getCantidad() {
		return Cantidad;
	}


	public void setCantidad(Integer cantidad) {
		Cantidad = cantidad;
	}


	public Double getTotal() {
		return total;
	}


	public void setTotal(Double total) {
		this.total = total;
	}


	public List<FacturaDetalle> getFacturaDetalle() {
		return facturaDetalle;
	}


	public void setFacturaDetalle(List<FacturaDetalle> facturaDetalle) {
		this.facturaDetalle = facturaDetalle;
	}


	public PedidoCabecera getPedidoCabecera() {
		return pedidoCabecera;
	}


	public void setPedidoCabecera(PedidoCabecera pedidoCabecera) {
		this.pedidoCabecera = pedidoCabecera;
	}


	public Producto getProducto() {
		return producto;
	}


	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	//
	
	
	
}
