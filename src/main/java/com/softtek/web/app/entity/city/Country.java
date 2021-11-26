package com.softtek.web.app.entity.city;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "COUNTRY")
public class Country {

	@Id
	@Column(name="CVE_COUNTRY")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cveCountry;
	
	@Column(name = "NOM_COUNTRY")
	private String nomCountry;
	
	@OneToMany
	@JoinColumn(name="CVE_COUNTRY")
	private Set<City> city;

	public Long getCveCountry() {
		return cveCountry;
	}

	public void setCveCountry(Long cveCountry) {
		this.cveCountry = cveCountry;
	}

	public String getNomCountry() {
		return nomCountry;
	}

	public void setNomCountry(String nomCountry) {
		this.nomCountry = nomCountry;
	}
	
	
	
	
}
