package com.utn.modelo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Alumno {

	@Size(min=5,max=10)
	private String nombre;
	private String apellido;

	@NotNull @Size(min=4, max=10)
	private String legajo;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getLegajo() {
		return legajo;
	}

	public void setLegajo(String legajo) {
		this.legajo = legajo;
	}

}
