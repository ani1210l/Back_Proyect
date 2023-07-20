package com.sinfloo.modeloDAO;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sinfloo.interfaces.ProductoInterface;
import com.sinfloo.modelo.Persona;
import com.sinfloo.modelo.Producto;
@Repository
public class ProductoDao implements ProductoInterface {

	@Autowired
	JdbcTemplate template;

	@Override
	public List<Map<String, Object>> listar() {
		List<Map<String, Object>> list = template.queryForList("SELECT * FROM producto JOIN categorias ON producto.id_categoria= categorias.id_categoria");
		return list;
	}

	@Override
	public List<Map<String, Object>> listarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int add(Producto p) {
		String sql = "insert into producto(prod_cantidad,prod_cod,prod_descripcion,prod_precio,prod_img)values(?,?,?,?,?)";
		return template.update(sql, p.getProd_catidad(), p.getProd_descripcion());
	}

	@Override
	public int edit(Producto p) {
		String sql="update producto set prod_cantidad=?, prod_cod=? where id=?";		
		return template.update(sql,p.getProd_catidad(),p.getProd_descripcion(),p.getIdProducto());
	}

	@Override
	public int delete(int id) {
		String sql="delete from producto where id=?";
		return template.update(sql,id);
	}

}
