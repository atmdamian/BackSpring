package com.softtek.web.app.controller.persona;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.softtek.web.app.dto.PersonaDto;
import com.softtek.web.app.service.persona.PersonaService;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("api/persona")
@CrossOrigin
@Api(value = "Persona Controller", description = "Administrar persona")
public class PersonaController {
	
	@Autowired
	PersonaService service;
	@GetMapping
	public List<PersonaDto> obtenerPersonas() {
		return service.findAll();

	}
}
