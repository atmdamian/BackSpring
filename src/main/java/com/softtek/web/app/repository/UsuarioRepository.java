package com.softtek.web.app.repository;

import java.util.List;

import com.softtek.web.app.entity.usuario.Usuario;

public interface UsuarioRepository {

	public void save(Usuario usuario);

	public List<Usuario> findAll();

	public List<Usuario> findByUsuario(String usuario);
	
	public void delete(Integer id);
	
}
