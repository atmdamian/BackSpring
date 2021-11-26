package com.softtek.web.app.service;

import java.util.List;

import com.softtek.web.app.dto.EquipoDto;
import com.softtek.web.app.entity.equipo.Equipo;

public interface EquipoService {

	public EquipoDto caculatTotal();
	List<EquipoDto> findByIndActivo(Integer indActivo);
	//EquipoDto findById(Integer cveEquipo);
	List<EquipoDto> findByDescripcion(String descripcion);
	EquipoDto getCount(Integer indActivo);
	
	Equipo save(EquipoDto equipoDto);
}
