package com.softtek.web.app.service;

import java.util.List;

import com.softtek.web.app.entity.usuario.Usuario;

public interface UsuarioService {

	public void save(Usuario usuario);

	public List<Usuario> findAll();
	
	public List<Usuario> findByUsuario(String usuario);

}
