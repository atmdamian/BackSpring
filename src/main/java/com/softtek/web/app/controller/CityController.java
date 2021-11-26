package com.softtek.web.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.softtek.web.app.dto.CourseDto;
import com.softtek.web.app.dto.city.CityDto;
import com.softtek.web.app.entity.Course.Course;
import com.softtek.web.app.entity.city.City;
import com.softtek.web.app.service.CourseService;
import com.softtek.web.app.service.city.ServiceCity;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("api/city")
@CrossOrigin
@Api(value = "City Controller", description = "Administrar City")
public class CityController {

	@Autowired
	ServiceCity serviceCity;
	
	@Autowired
	CourseService courseService;
	
	@GetMapping
	public List<City> getCity(){
		return serviceCity.finAll();
	}
	@PostMapping("save")
	public City saveCityAndCountry(@RequestBody City city) {
		return serviceCity.saveCityAndCountry(city);
	}
	
	@PostMapping("saveCity")
	public City findCountryAndsaveCity(@RequestBody CityDto cityDto) {
		return serviceCity.findCountryAndsaveCity(cityDto);
	}

	@PostMapping("saveCourse")
	public Course saveCourse(@RequestBody CourseDto courseDto) {
		return courseService.saveCourseAndContents(courseDto);
	}
	
}
