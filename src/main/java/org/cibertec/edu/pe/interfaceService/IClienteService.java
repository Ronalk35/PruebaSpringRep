package org.cibertec.edu.pe.interfaceService;

import java.util.List;
import java.util.Optional;

import org.cibertec.edu.pe.modelo.Cliente;

public interface IClienteService {
	
	public List<Cliente> Listado();
	public Optional<Cliente> Buscar(int id);
	public int Grabar(Cliente ObjC);
	public void Suprimir(int id);

}
