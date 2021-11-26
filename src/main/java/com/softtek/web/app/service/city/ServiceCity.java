package com.softtek.web.app.service.city;

import java.util.List;

import com.softtek.web.app.dto.city.CityDto;
import com.softtek.web.app.entity.city.City;

public interface ServiceCity {
	
	City saveCityAndCountry(City city);
	
	City findCountryAndsaveCity(CityDto cityDto);
	
	List<City> finAll();
}
