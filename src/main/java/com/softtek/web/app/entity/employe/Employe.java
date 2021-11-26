package com.softtek.web.app.entity.employe;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYE")
public class Employe {
	
	@Id
	@Column(name="CVE_EMPLOYE")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cveEmploye;
	
	@Column(name = "NAME")
	private String name;
	
	//@OneToOne(cascade = {CascadeType.ALL})
	//@JoinColumn(name="CVE_ADDRES")
	//private Addres addres;
	
	@OneToMany(cascade = {CascadeType.ALL})
	@JoinColumn(name="CVE_EMPLOYE", referencedColumnName = "CVE_EMPLOYE")
	private List<Addres> addres;

	public Long getCveEmploye() {
		return cveEmploye;
	}

	public void setCveEmploye(Long cveEmploye) {
		this.cveEmploye = cveEmploye;
	}

	
	public List<Addres> getAddres() {
		return addres;
	}

	public void setAddres(List<Addres> addres) {
		this.addres = addres;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
