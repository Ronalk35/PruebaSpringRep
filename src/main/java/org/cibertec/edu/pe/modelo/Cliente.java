package org.cibertec.edu.pe.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente {

	// Compos o Atributos
    @Id
	private int Id;
	private String Apellidos;
	private String Nombres;
	private int Edad;
	private char Sexo;

	// Metodos Constructores
	public Cliente() {

	}

	public Cliente(int id, String apellidos, String nombres, int edad, char sexo) {

		Id = id;
		Apellidos = apellidos;
		Nombres = nombres;
		Edad = edad;
		Sexo = sexo;
	}

    //Metodos de Lectura y Escritura
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getApellidos() {
		return Apellidos;
	}

	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}

	public String getNombres() {
		return Nombres;
	}

	public void setNombres(String nombres) {
		Nombres = nombres;
	}

	public int getEdad() {
		return Edad;
	}

	public void setEdad(int edad) {
		Edad = edad;
	}

	public char getSexo() {
		return Sexo;
	}

	public void setSexo(char sexo) {
		Sexo = sexo;
	}

}
