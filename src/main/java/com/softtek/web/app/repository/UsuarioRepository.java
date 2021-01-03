package com.softtek.web.app.repository;

import java.util.List;
import java.util.Optional;

import com.softtek.web.app.entity.usuario.Usuario;
import com.softtek.web.app.model.UsuarioDomicilio;

public interface UsuarioRepository {

	public void save(Usuario usuario);

	public List<Usuario> findAll();
	
	public List<Usuario> findAllWhitDomicilio();
	
	public Usuario findByUsuario(String nombreUsuario);
	
	public void delete(Integer id);
	
}
