package com.softtek.web.app;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.annotation.DirtiesContext;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.softtek.web.app.controller.UsuarioController;
import com.softtek.web.app.entity.usuario.Usuario;
import com.softtek.web.app.response.ResponseMethod;
import com.softtek.web.app.service.UsuarioService;

@SpringBootTest
class SofttekAppWebBackApplicationTests {
	private static Logger LOGGER = LoggerFactory.getLogger( SofttekAppWebBackApplicationTests.class);

	@Mock
	UsuarioService usuarioService;
	
	@InjectMocks		
	private UsuarioController usuarioController;

	@Test
	@DirtiesContext
	public void save_test() {
		LOGGER.info("TEST UNITARIO SAVE PERSIST");
		Usuario usuario = new Usuario();
		usuario.setNombre("TEST");
		usuario.setUsuario("test");
		usuario.setPw("test");
		usuarioService.save(usuario);
	}
	
	@Test
	@DirtiesContext
	public void finadAll_test() {
		LOGGER.info("TEST UNITARIO FINDALL");
		usuarioService.findAll();
	}
	
	@Test
	@DirtiesContext
	public void finadAll_findByUsuario() {
		LOGGER.info("TEST UNITARIO FINDBYUSUARIO");
		List<Usuario> usuarios = usuarioService.findByUsuario("DAMIAN");
		usuarios.stream().forEach(list->{
			assertEquals("DAMIAN", list.getNombre());

		});
		
	}
	
	@Test
	public void agregarUsuario_test() {	
		Gson g = new Gson(); 
		Usuario usuario = new Usuario();
		
		usuario.setNombre("TEST");
		usuario.setUsuario("test");
		usuario.setPw("test");
		
		ResponseEntity<?>  httpResponse =usuarioController.agregarUsuario(usuario);
		
		LOGGER.info("STATUS CODE "+httpResponse.getStatusCode());	
		LOGGER.info("BODY "+httpResponse.getBody());	
		LOGGER.info("CODE "+httpResponse.getStatusCodeValue());
		LOGGER.info("CLASS "+httpResponse.getClass());
		LOGGER.info("HEADERS "+httpResponse.getHeaders());

		
		ResponseMethod response = g.fromJson((String) httpResponse.getBody(), ResponseMethod.class);

		Assert.assertEquals(httpResponse.getStatusCodeValue(), 200);
		Assert.assertEquals(httpResponse.getStatusCode(), HttpStatus.OK);
		Assert.assertEquals("GUARDADO CORRECTAMENTE", response.getMensaje());
		Assert.assertEquals("200", response.getEstatus());	
	}
	
	
	

}
