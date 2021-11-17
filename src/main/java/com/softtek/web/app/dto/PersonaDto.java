package com.softtek.web.app.dto;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import com.softtek.web.app.model.Persona;

public class PersonaDto {
	
	private Long cvePersona;
	private String desCorreoElectronico;
	private String nomApellidoMaterno;
	private String nomApellidoPaterno;
	private String nomNombre;
	private Long numExt;
	private Long numTelefono;
	
	
	
	public PersonaDto(Persona persona) {
		super();
		this.cvePersona = persona.getCvePersona();
		this.desCorreoElectronico = persona.getDesCorreoElectronico();
		this.nomApellidoMaterno = persona.getNomApellidoMaterno();
		this.nomApellidoPaterno = persona.getNomApellidoPaterno();
		this.nomNombre = nomNombre = persona.getNomNombre();
		this.numExt = persona.getNumExt();
		this.numTelefono = persona.getNumTelefono();
	}
	public Long getCvePersona() {
		return cvePersona;
	}
	public void setCvePersona(Long cvePersona) {
		this.cvePersona = cvePersona;
	}
	public String getDesCorreoElectronico() {
		return desCorreoElectronico;
	}
	public void setDesCorreoElectronico(String desCorreoElectronico) {
		this.desCorreoElectronico = desCorreoElectronico;
	}
	public String getNomApellidoMaterno() {
		return nomApellidoMaterno;
	}
	public void setNomApellidoMaterno(String nomApellidoMaterno) {
		this.nomApellidoMaterno = nomApellidoMaterno;
	}
	public String getNomApellidoPaterno() {
		return nomApellidoPaterno;
	}
	public void setNomApellidoPaterno(String nomApellidoPaterno) {
		this.nomApellidoPaterno = nomApellidoPaterno;
	}
	public String getNomNombre() {
		return nomNombre;
	}
	public void setNomNombre(String nomNombre) {
		this.nomNombre = nomNombre;
	}
	public Long getNumExt() {
		return numExt;
	}
	public void setNumExt(Long numExt) {
		this.numExt = numExt;
	}
	public Long getNumTelefono() {
		return numTelefono;
	}
	public void setNumTelefono(Long numTelefono) {
		this.numTelefono = numTelefono;
	}
	
	

}
