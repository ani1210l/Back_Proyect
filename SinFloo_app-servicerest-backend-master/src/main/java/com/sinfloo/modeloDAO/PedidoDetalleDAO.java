package com.sinfloo.modeloDAO;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sinfloo.interfaces.PedidoDetalleInterfaz;
import com.sinfloo.modelo.PedidoDetalle;

@Repository
public class PedidoDetalleDAO implements PedidoDetalleInterfaz{
	@Autowired
	JdbcTemplate template;

	@Override
	public List<Map<String, Object>> listar() {
		List<Map<String, Object>> list = template.queryForList("SELECT * FROM cliente JOIN persona ON cliente.id_persona= persona.id");
		return list;
	}

	@Override
	public List<Map<String, Object>> listarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int add(PedidoDetalle p) {
		String sql = "INSERT INTO `cliente` (`usuario`, `password`) VALUES (?, ?);";
		return template.update(sql, p.getCantidad(), p.getProducto());
	}


	@Override
	public int edit(PedidoDetalle p) {
		String sql="UPDATE `cliente` SET `usuario` = ?, `password` = ? WHERE `id` = ?";		
		return template.update(sql,p.getCantidad(),p.getFacturaDetalle());
	}


	@Override
	public int delete(int id) {
		String sql="delete from cliente where id=?";
		return template.update(sql,id);
		
		
		
		
	}

}
