package com.softtek.web.app.controller.sas;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.softtek.web.app.dto.sas.SastUsuarioDTO;
import com.softtek.web.app.service.sas.SastUsuarioService;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("api/SastUsuario")
@CrossOrigin
@Api(value = "SastUsuario Controller", description = "Administrar SastUsuario")
public class SastUsuarioController {
	@Autowired
	SastUsuarioService sastUsuarioService;
	
	@GetMapping
	public List<SastUsuarioDTO> getSastUsuario() {
		return sastUsuarioService.findAllSastUsuario();
	}
	@PostMapping
	public SastUsuarioDTO agregarSastUsuario(@RequestBody SastUsuarioDTO sastUsuarioDTO) {
		return sastUsuarioService.saveSastUsuario(sastUsuarioDTO);
	}
}
