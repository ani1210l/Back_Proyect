package com.sinfloo.interfaces;

import java.util.List;
import java.util.Map;

import com.sinfloo.modelo.PedidoCabecera;

public interface PedidoCabeceraInterfaz {
	public List<Map<String, Object>>listar();
	public List<Map<String, Object>>listarId(int id);
	public int add(PedidoCabecera c);
	public int edit(PedidoCabecera c);
	public int delete(int id);
	
}