package org.cibertec.edu.pe.services;

import java.util.List;
import java.util.Optional;

import org.cibertec.edu.pe.interfaceService.IClienteService;
import org.cibertec.edu.pe.interfaces.ICliente;
import org.cibertec.edu.pe.modelo.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ClienteService implements IClienteService{

	@Autowired
	private ICliente data;
	@Override
	public List<Cliente> Listado() {
		return (List<Cliente>)data.findAll();
	}

	@Override
	public Optional<Cliente> Buscar(int id) {
		return data.findById(id);
	}

	@Override
	public int Grabar(Cliente ObjC) {
		int rpta = 0;
		Cliente c = data.save(ObjC);
		if(!c.equals(null))rpta = 1;
		return rpta;
	}

	@Override
	public void Suprimir(int id) {
		data.deleteById(id);
		
	}

}
