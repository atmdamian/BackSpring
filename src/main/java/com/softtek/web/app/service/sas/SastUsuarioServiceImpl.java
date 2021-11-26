package com.softtek.web.app.service.sas;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softtek.web.app.dto.PersonaDto;
import com.softtek.web.app.dto.sas.SastUsuarioDTO;
import com.softtek.web.app.entity.sas.SastPersona;
import com.softtek.web.app.entity.sas.SastUsuario;
import com.softtek.web.app.repository.sas.SastPersonaRepository;
import com.softtek.web.app.repository.sas.SastUsuarioRepository;

@Service
public class SastUsuarioServiceImpl implements SastUsuarioService {
	@Autowired
	SastUsuarioRepository sastUsuarioRepository;
	@Autowired
	SastPersonaRepository sastPersonaRepository;
	
	@Override
	public SastUsuarioDTO saveSastUsuario(SastUsuarioDTO sastUsuarioDTO) {				
		SastUsuario sastUsuario = new SastUsuario(sastUsuarioDTO,sastPersonaRepository.findByNomNombre(sastUsuarioDTO.getNomUsuario()));	
		SastUsuarioDTO sastUsuarioDto = new SastUsuarioDTO(sastUsuarioRepository.save(sastUsuario));
		return sastUsuarioDto;
	}

	@Override
	public List<SastUsuarioDTO> findAllSastUsuario() {
		return sastUsuarioRepository.findAll().stream().map(SastUsuarioDTO::new).collect(Collectors.toList());
	}
}
