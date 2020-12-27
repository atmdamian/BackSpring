package com.softtek.web.app.controller.producto;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
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
@Api(value = "Producto Controller", description = "Administrar Productos")
public class ProductoController {
	
	@Autowired
	ProductoService productoService;

	@GetMapping
	public List<Producto> obtener() {
		return productoService.findAll();
	}
	
	@GetMapping("{id}")
	public ResponseEntity<?> obtenerPorId(@PathVariable Integer id) {
		Map<String, Object> map = new HashMap<>();
		Producto producto;
		try {
			producto = productoService.findById(id);		
			if(producto == null) {
				map.put("mensaje", "El cliente ID: ".concat(id.toString()).concat(" no existe en base de datos!"));
				return new ResponseEntity<Map<String, Object>>(map, HttpStatus.NOT_FOUND);
			}

		}catch(DataAccessException e) {
			map.put("mensaje", "Error al realizar la consulta la base de datos");
			map.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return new ResponseEntity<Producto>(producto, HttpStatus.OK);
				
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<?> crear(@RequestBody Producto producto) {	
		Producto validaProducto;
		Map<String, Object> map = new HashMap<>();

		try {
			validaProducto = productoService.save(producto); 
			
		}catch(DataAccessException e) {
			map.put("mensaje", "Error al insertar en la base de datos");
			map.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map.put("mensaje", "El producto se creo con exito!");
		map.put("producto", validaProducto);
		return new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
	}

	@PutMapping("{id}")
	public ResponseEntity<?> actualizar(@RequestBody Producto producto,@PathVariable Integer id) {
		Producto productoActual  = productoService.findById(id);
		Producto productoActualizado= null;
		Map<String, Object> map = new HashMap<>();
		try {

			if(productoActual == null) {
			map.put("mensaje", "Error: no se pudo editar, El cliente ID: ".concat(id.toString()).concat(" no existe en base de datos!"));
			productoActual.setNombre(producto.getNombre());
			productoActual.setPrecio(producto.getPrecio());
			productoActual.setDescripcion(producto.getDescripcion());
			productoActual.setNombreImagen(producto.getNombreImagen());
			productoActualizado= productoService.save(productoActualizado);
			return new ResponseEntity<Map<String, Object>>(map, HttpStatus.NOT_FOUND);
		}
		}catch(DataAccessException e) {
			map.put("mensaje", "Error al actualizar en la base de datos");
			map.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		map.put("mensaje", "El producto se actualizo con exito!");
		map.put("producto", productoActualizado);
		return new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<?> eliminar(@PathVariable Integer id) {
		Map<String, Object> map = new HashMap<>();
		
		try {
		productoService.delete(id);
		}catch(DataAccessException e) {
			map.put("mensaje", "Error al eliminar en la base de datos");
			map.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		map.put("mensaje", "El producto se elimino con exito!");
		return new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		
	}


}
