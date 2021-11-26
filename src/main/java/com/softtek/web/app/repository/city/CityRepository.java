package com.softtek.web.app.repository.city;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.softtek.web.app.entity.city.City;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {

}
