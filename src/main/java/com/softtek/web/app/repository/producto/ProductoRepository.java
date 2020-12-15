package com.softtek.web.app.repository.producto;

import java.util.List;

import com.softtek.web.app.entity.producto.Producto;

public interface ProductoRepository {
	
	public List<Producto> findAll();

}
