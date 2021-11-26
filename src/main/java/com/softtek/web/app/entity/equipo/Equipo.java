package com.softtek.web.app.entity.equipo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SPA_EQUIPO")
public class Equipo implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "CVE_EQUIPO")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cveEquipo;
	@Column(name = "NUM_NO_EQUIPO")
	private Integer numNoEquipos;
	@Column(name = "DES_UNIDAD_SPECT")
	private String desUnidadEspect;
	
	@Column(name = "IND_ACTIVO")
	private Integer indActivo;
	
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
	
	
}
