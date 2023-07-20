package com.sinfloo.modeloDAO;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.integration.IntegrationProperties.Jdbc;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sinfloo.interfaces.AdministradoresInterface;
import com.sinfloo.modelo.Administrador;
import com.sinfloo.modelo.Categoria;

@Repository
public class AdministradorDao implements AdministradoresInterface{
@Autowired
JdbcTemplate template;




@Override
public List<Map<String, Object>> listar() {
	List<Map<String, Object>> list = template.queryForList("select * from administradores");
	return list;
}

@Override
public List<Map<String, Object>> listarId(int id) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public int add(Administrador ad) {
	String sql = "insert into administradores(pasword,usuario)values(?,?)";
	return template.update(sql, ad.getPasword(), ad.getUsuario());
}


@Override
public int edit(Administrador p) {
	String sql="update categorias set pasword=?, usuario=? where id=?";		
	return template.update(sql,p.getPasword(),p.getUsuario(),p.getId_administrador());
}

@Override
public int delete(int id) {
	String sql="delete from administradores where id=?";
	return template.update(sql,id);
}	
}
