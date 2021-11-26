package com.softtek.web.app.repository.city;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.softtek.web.app.entity.city.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {
	@Query("SELECT co FROM Country co WHERE co.cveCountry=:cveCountry")
	Country findByCveContry(@Param("cveCountry") Long cveCountry);
}
