package com.softtek.web.app.repository.sas;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.softtek.web.app.dto.sas.SastPersonaDTO;
import com.softtek.web.app.entity.sas.SastPersona;

@Repository
public interface SastPersonaRepository extends JpaRepository<SastPersona, Long> {
	public SastPersona findByNomNombre(String nomNombre);
}
