package com.sinfloo.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinfloo.interfaces.CataegoriaInterface;
import com.sinfloo.modelo.Categoria;
import com.sinfloo.modeloDAO.CategoriaDao;
@Service
public class CategoriaService implements CataegoriaInterface {
	@Autowired
	CategoriaDao dao;

	@Override
	public List<Map<String, Object>> listar() {
		// TODO Auto-generated method stub
		return dao.listar();
	}

	@Override
	public List<Map<String, Object>> listarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int add(Categoria cat) {
		// TODO Auto-generated method stub
		return dao.add(cat);
	}

	@Override
	public int edit(Categoria cat) {
		// TODO Auto-generated method stub
		return dao.edit(cat);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return dao.delete(id);
	}

}
