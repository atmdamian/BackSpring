package com.softtek.web.app.service.sas;

import java.util.List;

import com.softtek.web.app.dto.sas.SastUsuarioDTO;

public interface SastUsuarioService {
	public SastUsuarioDTO saveSastUsuario(SastUsuarioDTO sastUsuarioDTO);
	public List<SastUsuarioDTO> findAllSastUsuario();
	
}
