package com.sinfloo.modeloDAO;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.sinfloo.interfaces.ClienteInterface;
import com.sinfloo.modelo.Cliente;

public class ClienteDAO implements ClienteInterface{
	@Autowired
	JdbcTemplate template;

	@Override
	public List<Map<String, Object>> listar() {
		List<Map<String, Object>> list = template.queryForList("SELECT * FROM cliente JOIN persona ON cliente.id_persona= persona.id_persona");
		return list;
	}


	@Override
	public List<Map<String, Object>> listarId(int id_cliente) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int add(Cliente c) {
		String sql = "INSERT INTO `cliente` (`usuario`, `password`) VALUES (?, ?);";
		return template.update(sql, c.getUsuario(), c.getPassword());
	}

	@Override
	public int edit(Cliente c) {
		String sql="UPDATE `cliente` SET `usuario` = ?, `password` = ? WHERE `id` = ?";		
		return template.update(sql,c.getUsuario(),c.getPassword());
	}

	@Override
	public int delete(int id) {
		String sql="delete from cliente where id=?";
		return template.update(sql,id);
	}
}

