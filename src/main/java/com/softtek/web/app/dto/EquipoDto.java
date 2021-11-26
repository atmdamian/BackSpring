package com.softtek.web.app.dto;

import com.softtek.web.app.entity.equipo.Equipo;

public class EquipoDto {
	
	private Integer cveEquipo;
	private Integer numNoEquipos;
	private String desUnidadEspect;
	private Integer indActivo;
	private Integer cuentaEquipos;
	
	public EquipoDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public EquipoDto(Equipo equipo) {
		super();
		this.cveEquipo = equipo.getCveEquipo();
		this.numNoEquipos = equipo.getNumNoEquipos();
		this.desUnidadEspect = equipo.getDesUnidadEspect();
		this.indActivo = equipo.getIndActivo();
	}


	public Integer getCveEquipo() {
		return cveEquipo;
	}
	public void setCveEquipo(Integer cveEquipo) {
		this.cveEquipo = cveEquipo;
	}
	public Integer getNumNoEquipos() {
		return numNoEquipos;
	}
	public void setNumNoEquipos(Integer numNoEquipos) {
		this.numNoEquipos = numNoEquipos;
	}
	public String getDesUnidadEspect() {
		return desUnidadEspect;
	}
	public void setDesUnidadEspect(String desUnidadEspect) {
		this.desUnidadEspect = desUnidadEspect;
	}
	public Integer getIndActivo() {
		return indActivo;
	}
	public void setIndActivo(Integer indActivo) {
		this.indActivo = indActivo;
	}

	public Integer getCuentaEquipos() {
		return cuentaEquipos;
	}

	public void setCuentaEquipos(Integer cuentaEquipos) {
		this.cuentaEquipos = cuentaEquipos;
	}
	
	
}
