package com.softtek.web.app.repository.producto;

import org.springframework.data.repository.CrudRepository;

import com.softtek.web.app.entity.producto.Producto;

public interface ProductoRepository  extends CrudRepository<Producto, Integer> {

	

}
