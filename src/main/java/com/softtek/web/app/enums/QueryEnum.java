package com.softtek.web.app.enums;

public enum QueryEnum {
	
	QUERY_CONSULTAR_PERSONA("QUERY_FIND_PERSONA","SELECT p FROM Persona p");
	
	private final String nombreQuery;

	private final String valor;
	
	private QueryEnum(String nombreQuery, String valor) {
		this.nombreQuery = nombreQuery;
		this.valor = valor;
	}

	public String getNombreQuery() {
		return nombreQuery;
	}

	public String getValor() {
		return valor;
	}
	
	
}
