package com.sinfloo.modelo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "facturaDetalles")

public class FacturaDetalle {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id_facturaD;

	
	@ManyToOne
	@JoinColumn(name = "id_pedidoDetalle")
	private PedidoDetalle pedidoDetalle;
	

	@ManyToOne
	@JoinColumn(name = "id_facturaC")
	private FacturaCabecera facturaCabecera;
	
	
	

	public PedidoDetalle getPedidoDetalle() {
		return pedidoDetalle;
	}

	public void setPedidoDetalle(PedidoDetalle pedidoDetalle) {
		this.pedidoDetalle = pedidoDetalle;
	}

	public FacturaCabecera getFacturaCabecera() {
		return facturaCabecera;
	}

	public void setFacturaCabecera(FacturaCabecera facturaCabecera) {
		this.facturaCabecera = facturaCabecera;
	}

	public int getId_facturaD() {
		return id_facturaD;
	}

	public void setId_facturaD(int id_facturaD) {
		this.id_facturaD = id_facturaD;
	}
	

	
}
