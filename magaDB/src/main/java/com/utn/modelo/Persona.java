package com.utn.modelo;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Persona {

	private String nombre;
	@Value("panella")

	private String apellido;

	public String getNombre() {
		return nombre;
	}

	@Required
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
}
