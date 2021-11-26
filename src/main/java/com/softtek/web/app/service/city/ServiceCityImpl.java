package com.softtek.web.app.service.city;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softtek.web.app.dto.city.CityDto;
import com.softtek.web.app.entity.city.City;
import com.softtek.web.app.entity.city.Country;
import com.softtek.web.app.repository.city.CityRepository;
import com.softtek.web.app.repository.city.CountryRepository;

@Service
public class ServiceCityImpl implements ServiceCity{
	
	@Autowired
	CityRepository cityRepository;
	
	@Autowired
	CountryRepository countryRespository;

	
	
	@Override
	public City saveCityAndCountry(City city) {
		return cityRepository.save(city);
	}
	@Override
	public City findCountryAndsaveCity(CityDto cityDto) {
		Country country =countryRespository.findByCveContry(cityDto.getCveCountry());
		City city = new City(cityDto, country);
		
		return cityRepository.save(city);
	}
	@Override
	public List<City> finAll() {
		// TODO Auto-generated method stub
		return cityRepository.findAll();
	}

}
