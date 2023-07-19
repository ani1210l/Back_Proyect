package com.sinfloo.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinfloo.interfaces.ClienteInterface;
import com.sinfloo.modelo.Cliente;
import com.sinfloo.modeloDAO.ClienteDAO;

@Service
public class ClienteService implements ClienteInterface{

	@Autowired
	ClienteDAO cldao;
	@Override
	public List<Map<String, Object>> listar() {
		// TODO Auto-generated method stub
		return cldao.listar();
	}

	@Override
	public List<Map<String, Object>> listarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int add(Cliente c) {
		// TODO Auto-generated method stub
		return cldao.add(c);
	}

	@Override
	public int edit(Cliente c) {
		// TODO Auto-generated method stub
		return cldao.edit(c);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return cldao.delete(id);
	}

	
}
