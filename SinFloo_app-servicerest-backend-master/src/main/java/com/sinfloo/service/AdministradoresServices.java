package com.sinfloo.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinfloo.interfaces.AdministradoresInterface;
import com.sinfloo.modelo.Administrador;
import com.sinfloo.modeloDAO.AdministradorDao;
@Service
public class AdministradoresServices implements AdministradoresInterface {
@Autowired
AdministradorDao dao;
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
	public int add(Administrador ad) {
		// TODO Auto-generated method stub
		return dao.add(ad);
 
	}

	@Override
	public int edit(Administrador ad) {
		// TODO Auto-generated method stub
		return dao.edit(ad);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return dao.delete(id);
	}

}
