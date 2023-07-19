package com.sinfloo.modeloDAO;

import java.util.List;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sinfloo.interfaces.CataegoriaInterface;
import com.sinfloo.modelo.Categoria;
import com.sinfloo.modelo.Persona;

@Repository

public class CategoriaDao implements CataegoriaInterface{

	@Autowired
	JdbcTemplate template;

	@Override
	public List<Map<String, Object>> listar() {
		List<Map<String, Object>> list = template.queryForList("select * from categorias");
		return list;
	}

	@Override
	public List<Map<String, Object>> listarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int add(Categoria p) {
		String sql = "insert into categorias(nombre,tipo)values(?,?)";
		return template.update(sql, p.getNombre(), p.getTipo());
	}

	@Override
	public int edit(Categoria p) {
		String sql="update categorias set nombre=?, tipo=? where id=?";		
		return template.update(sql,p.getNombre(),p.getTipo(),p.getId_categoria());
	}

	@Override
	public int delete(int id) {
		String sql="delete from categorias where id=?";
		return template.update(sql,id);
	}

}