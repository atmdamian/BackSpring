package com.softtek.web.app.dto.city;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.softtek.web.app.entity.city.City;

public class CountryDto {
	
	private Long cveCountry;
	
	private String nomCountry;

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

	public Set<City> getCity() {
		return city;
	}

	public void setCity(Set<City> city) {
		this.city = city;
	}
	
	
}
