package com.softtek.web.app.entity.usuario;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.softtek.web.app.enums.Pais;

@Entity
@Table(name = "domicilios")
public class Domicilio implements Serializable {
	

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_domicilio")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String colonia;

	private String municipio;

	@Column(name = "no_calle")
	private String noCalle;
	
	@Enumerated(EnumType.STRING)
	private Pais pais;

	public Domicilio() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Domicilio(Integer id, String colonia, String municipio, String noCalle, Pais pais) {
		super();
		this.id = id;
		this.colonia = colonia;
		this.municipio = municipio;
		this.noCalle = noCalle;
		this.pais = pais;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getColonia() {
		return colonia;
	}

	public void setColonia(String colonia) {
		this.colonia = colonia;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getNoCalle() {
		return noCalle;
	}

	public void setNoCalle(String noCalle) {
		this.noCalle = noCalle;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	@Override
	public String toString() {
		return "Domicilio [id=" + id + ", colonia=" + colonia + ", municipio=" + municipio + ", noCalle=" + noCalle
				+ ", pais=" + pais + "]";
	}

}
