package com.sinfloo.modelo;



import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import javax.persistence.UniqueConstraint;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
@Table(name = "facturaCabeceras", uniqueConstraints = {@UniqueConstraint(columnNames ={"id_cliente"})})

public class FacturaCabecera {



	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id_facturaC;

	@ManyToOne
	@JoinColumn(name = "id_pedidoC")
	private PedidoCabecera pedidoCabecera;


	@OneToMany(mappedBy="facturaCabecera", cascade = CascadeType.ALL)
	private List<FacturaDetalle> facturaDetalle;
	
	
	
	
	public int getId_facturaC() {
		return id_facturaC;
	}

	public void setId_facturaC(int id_facturaC) {
		this.id_facturaC = id_facturaC;
	}
	

	

	
}
