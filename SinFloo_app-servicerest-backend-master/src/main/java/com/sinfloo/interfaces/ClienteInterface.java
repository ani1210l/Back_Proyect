package com.sinfloo.interfaces;

import java.util.List;
import java.util.Map;

import com.sinfloo.modelo.Cliente;

public interface ClienteInterface {

	public List<Map<String, Object>>listar();
	public List<Map<String, Object>>listarId(int id);
	public int add(Cliente c);
	public int edit(Cliente c);
	public int delete(int id);
	
}
