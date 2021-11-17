package com.softtek.web.app.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "PERSONA")
public class Persona implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "Persona_Gen_Seq")
	@SequenceGenerator(name = "Persona_Gen_Seq", sequenceName = "SEQ_PERSONA")
	@Column(name = "CVE_PERSONA")
	private Long cvePersona;

	@Column(name = "DES_CORREO_ELECTRONICO")
	private String desCorreoElectronico;

	@Column(name = "NOM_APELLIDO_MATERNO")
	private String nomApellidoMaterno;

	@Column(name = "NOM_APELLIDO_PATERNO")
	private String nomApellidoPaterno;

	@Column(name = "NOM_NOMBRE")
	private String nomNombre;

	@Column(name = "NUM_EXT")
	private Long numExt;

	@Column(name = "NUM_TELEFONO")
	private Long numTelefono;

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
