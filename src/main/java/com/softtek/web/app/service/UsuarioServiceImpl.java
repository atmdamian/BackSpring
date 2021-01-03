package com.softtek.web.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softtek.web.app.entity.usuario.Usuario;
import com.softtek.web.app.model.UsuarioDomicilio;
import com.softtek.web.app.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	public void save(Usuario usuario) {
		usuarioRepository.save(usuario);
	}

	@Override
	public List<Usuario> findAll() {
		return usuarioRepository.findAll();
	}

	@Override
	public Usuario findByUsuario(String usuario) {
		return usuarioRepository.findByUsuario(usuario);
	}

	@Override
	public List<Usuario> findAllWhitDomicilio() {
		return usuarioRepository.findAllWhitDomicilio();
	}

	@Override
	public void delete(Integer id) {
		usuarioRepository.delete(id);
	}


}
