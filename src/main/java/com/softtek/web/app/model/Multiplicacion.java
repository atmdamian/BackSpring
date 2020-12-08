package com.softtek.web.app.model;

public class Multiplicacion {

	private Integer factor;
	private Integer producto;
	private Integer resultado;

	public Multiplicacion() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Multiplicacion(Integer factor, Integer producto, Integer resultado) {
		super();
		this.factor = factor;
		this.producto = producto;
		this.resultado = resultado;
	}


	public Multiplicacion(Integer factor, Integer producto) {
		super();
		this.factor = factor;
		this.producto = producto;
	}

	public Integer getResultado() {
		return resultado;
	}

	public void setResultado(Integer resultado) {
		this.resultado = resultado;
	}

	public Integer getFactor() {
		return factor;
	}

	public void setFactor(Integer factor) {
		this.factor = factor;
	}

	public Integer getProducto() {
		return producto;
	}

	public void setProducto(Integer producto) {
		this.producto = producto;
	}

}
