package com.softtek.web.app.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.exception.DataException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.softtek.web.app.entity.producto.Producto;
import com.softtek.web.app.entity.usuario.Usuario;
import com.softtek.web.app.model.UsuarioDomicilio;
import com.softtek.web.app.response.ResponseMethod;
import com.softtek.web.app.service.UsuarioService;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("api/usuario")
@CrossOrigin
@Api(value = "Usuario Controller", description = "Administrar Usuarios")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;

	@GetMapping
	public List<Usuario> obtenerUsuarios() {
		return usuarioService.findAll();

	}

	@GetMapping("/domicilio/pais")
	public List<Usuario> obtenerUsuarioConDomicilioPorPais() {
		return usuarioService.findAllWhitDomicilio();

	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public @ResponseBody ResponseEntity<?> agregarUsuario(@RequestBody Usuario usuario) {
		Map<String, Object> map = new HashMap<>();

		try {
			usuarioService.save(usuario);
		} catch (DataAccessException e) {
			map.put("mensaje", "Error al insertar en la base de datos");
			map.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);

		}

		map.put("mensaje", "El usuario se creo con exito!");
		return new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);

	}

	@GetMapping("/byUsuario")
	public ResponseEntity<?> obtenerPorUsuario(@RequestParam String nombreUsuario) {
		Map<String, Object> map = new HashMap<>();
		Usuario usuario;
		try {
			usuario = usuarioService.findByUsuario(nombreUsuario);
			if (usuario == null) {
				map.put("mensaje", "El Usuario: ".concat(nombreUsuario).concat(" no existe en base de datos!"));
				return new ResponseEntity<Map<String, Object>>(map, HttpStatus.NOT_FOUND);
			}

		} catch (DataAccessException e) {
			map.put("mensaje", "Error al realizar la consulta la base de datos");
			map.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		return new ResponseEntity<Usuario>(usuario, HttpStatus.OK);

	}

	@DeleteMapping("{id}")
	public ResponseEntity<?> eliminar(@PathVariable Integer id) {
		Map<String, Object> map = new HashMap<>();

		try {
			usuarioService.delete(id);
		} catch (DataAccessException e) {
			map.put("mensaje", "Error al eliminar en la base de datos");
			map.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		map.put("mensaje", "El usuario se elimino con exito!");
		return new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);

	}

}
