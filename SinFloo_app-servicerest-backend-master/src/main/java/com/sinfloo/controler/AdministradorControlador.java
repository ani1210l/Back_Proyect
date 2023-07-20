package com.sinfloo.controler;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sinfloo.modelo.Administrador;
import com.sinfloo.service.AdministradoresServices;

@CrossOrigin(origins = { "http://localhost:4200/" })
@RestController
@RequestMapping("/administradores")
public class AdministradorControlador {
	@Autowired
	private AdministradoresServices service;
	
	@GetMapping ("/listar")
	public List<Map<String, Object>> listar(Model model) {
		return service.listar();
	}
		
	@PostMapping("/agregar")
	public String save(@RequestBody Administrador  cat,Model model) {
		int id=service.add(cat);
		if(id==0) {
			return "No se pudo Regsitrar!";
		}
		return "Se registró con éxito!";
	}
	
	@PostMapping("/actualizar/{id}")
	public String save(@RequestBody Administrador cat,@PathVariable int id,Model model) {
		cat.setId_administrador(id);
		int r=service.edit(cat);
		if(r==0) {
			return "No se pudo Actualizar!";
		}
		return "Se actualizó con éxito!";
	}
	@PostMapping("/eliminar/{id}")
	public String delete(@PathVariable int id,Model model) {
		int r=service.delete(id);
		if(r==0) {
			return "Registro No Eliminado!";
		}
		return "Registro Eliminado!";
	}
}
