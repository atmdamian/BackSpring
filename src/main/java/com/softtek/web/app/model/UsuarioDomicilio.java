package com.softtek.web.app.model;

public class UsuarioDomicilio {
	
	private String nombre;
	private String colonia;
	
	
	public UsuarioDomicilio() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UsuarioDomicilio(String nombre, String colonia) {
		super();
		this.nombre = nombre;
		this.colonia = colonia;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getColonia() {
		return colonia;
	}
	public void setColonia(String colonia) {
		this.colonia = colonia;
	}

	
	
	
	

}
