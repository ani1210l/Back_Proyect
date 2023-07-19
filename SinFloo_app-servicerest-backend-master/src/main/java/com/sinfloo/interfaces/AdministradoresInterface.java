package com.sinfloo.interfaces;

import java.util.List;
import java.util.Map;

import com.sinfloo.modelo.Administrador;

public interface AdministradoresInterface {
public List<Map<String,Object>>listar();
public  List<Map<String, Object>>listarId(int id);
public int add(Administrador ad);
public int edit (Administrador ad);
public int delete(int id);

}
