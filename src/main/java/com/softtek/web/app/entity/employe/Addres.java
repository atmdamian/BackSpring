package com.softtek.web.app.entity.employe;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ADDRES")
public class Addres implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "CVE_ADDRES")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cveAddres;
	
	@Column(name = "NAME_ADDRESS")
	private String nameAddres;
	
	//@OneToOne(mappedBy = "addres")
	
	//private Employe employe;

	
	public Long getCveAddres() {
		return cveAddres;
	}

	public void setCveAddres(Long cveAddres) {
		this.cveAddres = cveAddres;
	}

	public String getNameAddres() {
		return nameAddres;
	}

	public void setNameAddres(String nameAddres) {
		this.nameAddres = nameAddres;
	}
	

}
