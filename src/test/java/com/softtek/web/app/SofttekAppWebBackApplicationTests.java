package com.softtek.web.app;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

import com.softtek.web.app.entity.usuario.Usuario;
import com.softtek.web.app.service.UsuarioService;

@SpringBootTest
class SofttekAppWebBackApplicationTests {
	private static Logger LOGGER = LoggerFactory.getLogger( SofttekAppWebBackApplicationTests.class);

	@Autowired
	UsuarioService usuarioService;

	@Test
	@DirtiesContext
	public void save_test() {
		Usuario usuario = new Usuario();
		usuario.setNombre("TEST");
		usuario.setUsuario("test");
		usuario.setPw("test");
		usuarioService.save(usuario);
	}
	
	@Test
	@DirtiesContext
	public void finadAll_test() {
		usuarioService.findAll();
	}
	
	@Test
	@DirtiesContext
	public void finadAll_findByUsuario() {
		List<Usuario> usuarios = usuarioService.findByUsuario("DAMIAN");
		usuarios.stream().forEach(list->{
			assertEquals("DAMIAN", list.getNombre());

		});
		
	}
	
	
	

}
