package com.softtek.web.app.service;

import java.util.List;

import com.softtek.web.app.entity.usuario.Usuario;
import com.softtek.web.app.model.UsuarioDomicilio;

public interface UsuarioService {

	public void save(Usuario usuario);

	public List<Usuario> findAll();
	
	public List<Usuario> findAllWhitDomicilio();
		
	public Usuario findByUsuario(String usuario);
	
	public void delete(Integer id);

}
