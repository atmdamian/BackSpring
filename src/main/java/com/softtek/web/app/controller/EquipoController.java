package com.softtek.web.app.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.softtek.web.app.dto.EquipoDto;
import com.softtek.web.app.service.EquipoService;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("api/equipo")
@CrossOrigin
@Api(value = "Equipo Controller", description = "Administrar Equipo")
public class EquipoController {
	public static final Integer IND_ACTIVO = 1;
	@Autowired
	private EquipoService equipoService;

	@GetMapping
	public EquipoDto calcularTotalEquipos() {
		return equipoService.caculatTotal();
	}
	
	@GetMapping("/getByIndActivo/{indActivo}")
	public List<EquipoDto> getByIndActivo(@PathVariable Integer indActivo) {
		return equipoService.findByIndActivo(indActivo);
	}
	
	/*@GetMapping("/getById/{cveEquipo}")
	public EquipoDto getById(@PathVariable Integer cveEquipo) {
		return equipoService.findById(cveEquipo);
	}*/
	@GetMapping("/getByDescripcion/{descripcion}")
	public List<EquipoDto> getById(@PathVariable String descripcion) {
		return equipoService.findByDescripcion(descripcion);
	}
	@GetMapping("/getCountEquipo")
	public EquipoDto getCountEquipo() {
		return equipoService.getCount(IND_ACTIVO);
	}
}
