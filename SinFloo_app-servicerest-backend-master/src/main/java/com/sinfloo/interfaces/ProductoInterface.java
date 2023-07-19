package com.sinfloo.interfaces;

import java.util.List;
import java.util.Map;

import com.sinfloo.modelo.Producto;

public interface ProductoInterface {
	public List<Map<String, Object>>listar();
	public  List<Map<String, Object>>listarId(int id);
	public int add(Producto pro);
	public int edit (Producto pro);
	public int delete(int id);
		
	}
	
	


