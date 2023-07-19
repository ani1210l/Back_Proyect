package com.sinfloo.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinfloo.interfaces.PedidoCabeceraInterfaz;
import com.sinfloo.modelo.PedidoCabecera;
import com.sinfloo.modeloDAO.PedidoCabeceraDAO;
@Service
public class PedidoCabeceraService implements PedidoCabeceraInterfaz{
@Autowired
PedidoCabeceraDAO pediDAO;
	@Override
	public List<Map<String, Object>> listar() {
		// TODO Auto-generated method stub
		return pediDAO.listar();
	}

	@Override
	public List<Map<String, Object>> listarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int add(PedidoCabecera c) {
		// TODO Auto-generated method stub
		return pediDAO.add(c);
	}

	@Override
	public int edit(PedidoCabecera c) {
		// TODO Auto-generated method stub
		return pediDAO.edit(c);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return pediDAO.delete(id);
	}

}
