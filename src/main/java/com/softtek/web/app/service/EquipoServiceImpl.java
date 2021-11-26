package com.softtek.web.app.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softtek.web.app.dto.EquipoDto;
import com.softtek.web.app.entity.equipo.Equipo;
import com.softtek.web.app.repository.equipo.EquipoRepository;

@Service
public class EquipoServiceImpl implements EquipoService {
	@Autowired
	EquipoRepository equipoRepository;
	@Override
	public EquipoDto caculatTotal() {
		EquipoDto equipoDto = new EquipoDto();
		equipoDto.setNumNoEquipos(equipoRepository.getTotal());
		return equipoDto;
	}
	@Override
	public List<EquipoDto> findByIndActivo(Integer indActivo) {
		// TODO Auto-generated method stub
		return equipoRepository.findByIndActivo(indActivo).stream().map(EquipoDto::new).collect(Collectors.toList());
	}
	/*@Override
	public EquipoDto findById(Integer cveEquipo) {
		EquipoDto equipoDto =new EquipoDto(equipoRepository.findById(cveEquipo));
		return equipoDto;
	}*/
	
	@Override
	public List<EquipoDto> findByDescripcion(String descripcion) {
		return equipoRepository.findByDescripcion(descripcion).stream().map(EquipoDto::new).collect(Collectors.toList());
	}
	@Override
	public EquipoDto getCount(Integer indActivo) {
		EquipoDto equipo =new EquipoDto();
		equipo.setCuentaEquipos(equipoRepository.getCount(indActivo));
		return equipo;
	}
	@Override
	public Equipo save(EquipoDto equipoDto) {
		// TODO Auto-generated method stub
		return equipoRepository.save(null);
	}
	

}
