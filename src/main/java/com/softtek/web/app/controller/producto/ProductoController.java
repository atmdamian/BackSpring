package com.softtek.web.app.controller.producto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.softtek.web.app.entity.producto.Producto;
import com.softtek.web.app.service.producto.ProductoService;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("api/producto")
@CrossOrigin
@Api(value = "Producto Controller", description = "Registrar Productos")
public class ProductoController {
	
	@Autowired
	ProductoService productoService;

	@GetMapping
	public List<Producto> obtenerProductos() {
		return productoService.findAll();

	}

}
