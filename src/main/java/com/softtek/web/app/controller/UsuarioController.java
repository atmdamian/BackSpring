package com.softtek.web.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.softtek.web.app.entity.usuario.Usuario;
import com.softtek.web.app.response.ResponseMethod;
import com.softtek.web.app.service.UsuarioService;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("api/usuario")
@CrossOrigin
@Api(value = "Usuario Controller", description = "Registrar Usuarios")
public class UsuarioController {

	@Autowired
	UsuarioService usuarioService;

	@GetMapping
	public List<Usuario> obtenerUsuarios() {
		return usuarioService.findAll();

	}

	@PostMapping(value = "/agregar")
	public @ResponseBody ResponseEntity<?> agregarUsuario(@RequestBody Usuario usuario) {
		System.out.println("::::" + usuario.toString());
		try {
			usuarioService.save(usuario);
			return new ResponseEntity<String>(new Gson().toJson(new ResponseMethod("GUARDADO CORRECTAMENTE", "200")), HttpStatus.OK);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return new ResponseEntity<String>(new Gson().toJson(new ResponseMethod("ERROR SERVIDOR", "500")), HttpStatus.NOT_FOUND);


	}

	@GetMapping("/byUsuario")
	public List<Usuario> obtenerPorUsuario(@RequestParam String usuario) {
		return usuarioService.findByUsuario(usuario);

	}

}
