package com.softtek.web.app.entity.city;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.softtek.web.app.dto.city.CityDto;

@Entity
@Table(name = "CITY")
public class City {
	
	@Id
	@Column(name="CVE_CITY")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cveCity;
	
	
	@Column(name = "NOM_CITY")
	private String nomCity;
	
	@Column(name="CVE_COUNTRY")
	private Long cveCountry;
	
	@ManyToOne
	@JoinColumn(name ="CVE_COUNTRY", insertable = false, updatable = false)
	private Country country;
	
	public City() {
		super();
		// TODO Auto-generated constructor stub
	}

	public City(Long cveCity, String nomCity, Long cveCountry) {
		super();
		this.cveCity = cveCity;
		this.nomCity = nomCity;
		this.cveCountry = cveCountry;
	}
	

	public City(CityDto cityDto, Country country) {
		this.cveCity = cityDto.getCveCity();
		this.nomCity = cityDto.getNomCity();
		this.country = country;
	}

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

	/*public Long getCveCountry() {
		return cveCountry;
	}

	public void setCveCountry(Long cveCountry) {
		this.cveCountry = cveCountry;
	}*/

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}
	
	

}
