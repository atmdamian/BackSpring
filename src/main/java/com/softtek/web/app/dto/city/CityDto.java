package com.softtek.web.app.dto.city;


import com.softtek.web.app.entity.city.Country;

public class CityDto {

	private Long cveCity;

	private String nomCity;
	
	private Long cveCountry;

	public Long getCveCity() {
		return cveCity;
	}

	public void setCveCity(Long cveCity) {
		this.cveCity = cveCity;
	}

	public String getNomCity() {
		return nomCity;
	}

	public void setNomCity(String nomCity) {
		this.nomCity = nomCity;
	}

	public Long getCveCountry() {
		return cveCountry;
	}

	public void setCveCountry(Long cveCountry) {
		this.cveCountry = cveCountry;
	}

	
	
}
