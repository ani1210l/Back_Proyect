package com.sinfloo.interfaces;

import java.util.List;
import java.util.Map;

import com.sinfloo.modelo.Categoria;

public interface CataegoriaInterface {
	public List<Map<String, Object>>listar();
	public  List<Map<String, Object>>listarId(int id);
	public int add(Categoria cat);
	public int edit (Categoria cat);
	public int delete(int id);

}
