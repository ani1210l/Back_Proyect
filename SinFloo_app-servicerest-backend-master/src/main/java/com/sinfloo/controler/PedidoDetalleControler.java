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

import com.sinfloo.modelo.PedidoDetalle;
import com.sinfloo.service.PedidoDetalleService;


@RestController
@RequestMapping("/pedidoDetalle")
public class PedidoDetalleControler {
	@Autowired
	private PedidoDetalleService pedidoService;
	
	@GetMapping("/listar")
	public List<Map<String, Object>> listar(Model model) {
		return pedidoService.listar();
	}
		
	@PostMapping("/agregar")
	public String save(@RequestBody PedidoDetalle cli,Model model) {
		int id=pedidoService.add(cli);
		if(id==0) {
			return "No se pudo Regsitrar!";
		}
		return "Se registró con éxito!";
	}
	
	@PostMapping("/actualizar/{id}")
	public String save(@RequestBody PedidoDetalle cli,@PathVariable int id,Model model) {
		cli.setId_pedidoDetalle(id);
		int r=pedidoService.edit(cli);
		if(r==0) {
			return "No se pudo Actualizar!";
		}
		return "Se actualizó con éxito!";
	}
	@PostMapping("/eliminar/{id}")
	public String delete(@PathVariable int id,Model model) {
		int r=pedidoService.delete(id);
		if(r==0) {
			return "Registro No Eliminado!";
		}
		return "Registro Eliminado!";
	}
}