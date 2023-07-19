package com.sinfloo.controler;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sinfloo.modelo.Cliente;
import com.sinfloo.service.ClienteService;

@RestController
@RequestMapping("/clientes")
public class ClienteControler {

	@Autowired
	private ClienteService Cservice;
	
	@GetMapping("/listar")
	public List<Map<String, Object>> listar(Model model) {
		return Cservice.listar();
	}
		
	@PostMapping("/agregar")
	public String save(@RequestBody Cliente cli,Model model) {
		int id=Cservice.add(cli);
		if(id==0) {
			return "No se pudo Regsitrar!";
		}
		return "Se registró con éxito!";
	}
	
	@PostMapping("/actualizar/{id}")
	public String save(@RequestBody Cliente cli,@PathVariable int id,Model model) {
		cli.setId_cliente(id);
		int r=Cservice.edit(cli);
		if(r==0) {
			return "No se pudo Actualizar!";
		}
		return "Se actualizó con éxito!";
	}
	@PostMapping("/eliminar/{id}")
	public String delete(@PathVariable int id,Model model) {
		int r=Cservice.delete(id);
		if(r==0) {
			return "Registro No Eliminado!";
		}
		return "Registro Eliminado!";
	}
}