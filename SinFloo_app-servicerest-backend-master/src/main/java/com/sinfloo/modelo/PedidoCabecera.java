package com.sinfloo.modelo;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;



@Entity
@Table(name = "pedidoCabeceras", uniqueConstraints = {@UniqueConstraint(columnNames ={"id_cliente"})})
public class PedidoCabecera {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id_pedidoC;


	@Column(name = "pedid_fecha")
	@Temporal(TemporalType.DATE)
	private Date ped_fecha;

	

	// RELACIONES
	@ManyToOne
	@JoinColumn(name = "id_cliente")
	private Cliente cliente;


	@OneToMany(mappedBy = "pedidoCabecera", cascade = CascadeType.ALL)
	private List<FacturaCabecera> facturaCabecera;

	@OneToMany(mappedBy = "pedidoCabecera", cascade = CascadeType.ALL)
	private List<PedidoDetalle> pedidoDetalle;

//	
	
	



	

	public int getId_pedidoC() {
		return id_pedidoC;
	}

	public void setId_pedidoC(int id_pedidoC) {
		this.id_pedidoC = id_pedidoC;
	}

	
	public Date getPed_fecha() {
		return ped_fecha;
	}

	public void setPed_fecha(Date ped_fecha) {
		this.ped_fecha = ped_fecha;
	}


	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	
}
