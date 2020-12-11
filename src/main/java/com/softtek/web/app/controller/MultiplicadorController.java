package com.softtek.web.app.controller;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.softtek.web.app.entity.usuario.Usuario;
import com.softtek.web.app.model.Multiplicacion;
import com.softtek.web.app.response.ResponseMethod;
import com.softtek.web.app.service.UsuarioService;

import io.swagger.annotations.Api;

@RestController
@CrossOrigin
@RequestMapping("api/multiplicador")
@Api(value = "Multiplicador Controller", description = "Registrar Multiplicacion")
public class MultiplicadorController {
	
	@Autowired
	UsuarioService usuarioService;
	
	@GetMapping
	public @ResponseBody Multiplicacion obtenerSerie() {
			Random random = new Random();
			int factor = random.nextInt(100);
			int producto = random.nextInt(100);
			int resultado = factor * producto;
			return new Multiplicacion(factor, producto, resultado);

	}
	
	
	@GetMapping(value = "/usuariosRespuesta")
	public List<Usuario> obtenerUsuarios() {
		return usuarioService.findAll();
		
	}

}
