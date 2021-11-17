package com.softtek.web.app.service.persona;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softtek.web.app.dto.PersonaDto;
import com.softtek.web.app.repository.persona.PersonaRepository;

@Service
public class PersonaServiceImpl implements PersonaService{
	@Autowired
	private PersonaRepository repository;
	
	@Override
	public List<PersonaDto> findAll() {
		return repository.findAll().stream().map(PersonaDto::new).collect(Collectors.toList());
	}

}
