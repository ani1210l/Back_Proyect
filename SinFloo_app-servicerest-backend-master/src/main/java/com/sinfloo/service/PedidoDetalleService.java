package com.sinfloo.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinfloo.interfaces.PedidoDetalleInterfaz;
import com.sinfloo.modelo.PedidoDetalle;
import com.sinfloo.modeloDAO.PedidoDetalleDAO;

@Service
public class PedidoDetalleService implements PedidoDetalleInterfaz {
@Autowired
PedidoDetalleDAO pedeDAO;
	@Override
	public List<Map<String, Object>> listar() {
		// TODO Auto-generated method stub
		return pedeDAO.listar();
	}

	@Override
	public List<Map<String, Object>> listarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int add(PedidoDetalle p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int edit(PedidoDetalle p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
