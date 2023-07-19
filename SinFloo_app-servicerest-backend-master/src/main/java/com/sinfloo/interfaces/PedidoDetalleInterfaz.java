package com.sinfloo.interfaces;

import java.util.List;
import java.util.Map;

import com.sinfloo.modelo.PedidoDetalle;

public interface PedidoDetalleInterfaz {
	
	public List<Map<String, Object>>listar();
	public List<Map<String, Object>>listarId(int id);
public int add(PedidoDetalle p);
public int edit(PedidoDetalle p);
public int delete(int id);
}
