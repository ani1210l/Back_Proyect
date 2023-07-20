package com.sinfloo.modeloDAO;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sinfloo.interfaces.PedidoCabeceraInterfaz;
import com.sinfloo.modelo.PedidoCabecera;
@Repository
public class PedidoCabeceraDAO implements PedidoCabeceraInterfaz{
@Autowired
JdbcTemplate template;
	@Override
	public List<Map<String, Object>> listar() {
		List<Map<String, Object>> list = template.queryForList("SELECT * FROM pedidoCabeceras JOIN cliente ON cliente.id_persona= persona.id");
		return list;
	}

	@Override
	public List<Map<String, Object>> listarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int add(PedidoCabecera c) {
		String sql = "INSERT INTO `pedidoCabecera` (`pedid_fecha`, `id_cliente`) VALUES (?, ?,?);";
		return template.update(sql, c.getPed_fecha(),c.getCliente());
	}

	@Override
	public int edit(PedidoCabecera c) {
		String sql="UPDATE `pedidoCabecera` SET `pedid_fecha` = ? WHERE `id_pedido` = ?";		
		return template.update(sql,c.getPed_fecha(),c.getId_pedidoC());
	}


	@Override
	public int delete(int id) {
		String sql="delete from pedidoCabeceras where id_pedidoCabecera=?";
		return template.update(sql,id);
	}

}
