package com.softtek.web.app.controller.producto;

import java.util.List;

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
import com.softtek.web.app.entity.producto.Producto;
import com.softtek.web.app.entity.usuario.Usuario;
import com.softtek.web.app.response.ResponseMethod;
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
	
	@PostMapping(value = "/agregar")
	public @ResponseBody ResponseEntity<?> agregarProducto(@RequestBody Producto producto) {
		System.out.println("::::" + producto.toString());
		try {
			productoService.save(producto);
			return new ResponseEntity<String>(new Gson().toJson(new ResponseMethod("GUARDADO CORRECTAMENTE", "200")), HttpStatus.OK);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return new ResponseEntity<String>(new Gson().toJson(new ResponseMethod("ERROR SERVIDOR", "500")), HttpStatus.NOT_FOUND);


	}

	
	

}
