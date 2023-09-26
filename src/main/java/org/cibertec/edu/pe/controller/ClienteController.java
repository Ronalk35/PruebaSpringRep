package org.cibertec.edu.pe.controller;

import java.util.List;
import java.util.Optional;

import org.cibertec.edu.pe.interfaceService.IClienteService;
import org.cibertec.edu.pe.modelo.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ClienteController {
	
	@Autowired
	private IClienteService servicio;
	
	// Método para Listar
		@GetMapping("/listar")		// http://localhost:8080/listar
		public String Listar(Model m) {
			List<Cliente> lista = servicio.Listado();
			m.addAttribute("clientes", lista);
			return "listar";		// listar.html
		}
		
		// Método para Buscar
		@GetMapping("/ver/{id}")	// http://localhost:8080/ver/1
		public String ver(@PathVariable int id, Model m) {
			Optional<Cliente> c = servicio.Buscar(id);
			m.addAttribute("cliente", c);
			return "view";			// view.html
		}
		
		// Método para agregar
		@GetMapping("/nuevo")
		public String agregar(Model m) {
			m.addAttribute("cliente", new Cliente());
			return "form";			// form.html
		}
		
		// Método de editar
		@GetMapping("/editar/{id}")
		public String editar(@PathVariable int id, Model m) {
			Optional<Cliente> c = servicio.Buscar(id);
			m.addAttribute("cliente", c);
			return "form";			// form.html
		}
		
		// Método para grabar
		@GetMapping("/salvar")
		public String salvar(Cliente c, Model m) {
			servicio.Grabar(c);
			return "redirect:/listar";
		}
		
		// Método para suprimir
			@GetMapping("/eliminar/{id}")
			public String eliminar(@PathVariable int id, Model m) {
				servicio.Suprimir(id);
				return "redirect:/listar";
			}
		

}
