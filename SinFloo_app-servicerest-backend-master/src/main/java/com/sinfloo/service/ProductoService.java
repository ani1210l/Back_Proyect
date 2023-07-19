package com.sinfloo.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinfloo.interfaces.ProductoInterface;
import com.sinfloo.modelo.Producto;
import com.sinfloo.modeloDAO.ProductoDao;
@Service
public class ProductoService  implements ProductoInterface{

	@Autowired
	ProductoDao  dao;
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
	public int add(Producto pro) {
		// TODO Auto-generated method stub
		return dao.add(pro);
	}

	@Override
	public int edit(Producto pro) {
		// TODO Auto-generated method stub
		return dao.edit(pro);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return dao.delete(id);
	}
	
	
	

}
