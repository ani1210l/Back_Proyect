package com.sinfloo.modeloDAO;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sinfloo.interfaces.PersonaInterface;
import com.sinfloo.modelo.Persona;

@Repository
public class PersonaDAO implements PersonaInterface {

	@Autowired
	JdbcTemplate template;

	@Override
	public List<Map<String, Object>> listar() {
		List<Map<String, Object>> list = template.queryForList("select * from persona");
		return list;
	}

	@Override
	public List<Map<String, Object>> listarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int add(Persona p) {
		String sql = "INSERT INTO `persona` (`apellidos`, `nombres`, `cedula`, `correo`, `direccion`, `fechanacimiento`, `telefono`) VALUES (?, ?, ?, ?, ?, ?, ?);";
		return template.update(sql, p.getApellidos(), p.getNombres(),p.getCedula(),p.getCorreo(),p.getDireccion(),p.getFechanacimiento(),p.getTelefono());
	}

	@Override
	public int edit(Persona p) {
		String sql="UPDATE `persona` SET `apellidos` = ?, `nombres` = ?, `cedula` = ?, `correo` = ?, `direccion` = ?, `fechanacimiento` = ?, `telefono` = ? WHERE `persona`.`id` = ?";		
		return template.update(sql,p.getApellidos(),p.getNombres(),p.getCedula(),p.getCorreo(),p.getDireccion(),p.getFechanacimiento(),p.getTelefono(),p.getId());
	}

	@Override
	public int delete(int id) {
		String sql="delete from persona where id=?";
		return template.update(sql,id);
	}

}
