package com.softtek.web.app.service.producto;

import java.util.List;

import com.softtek.web.app.entity.producto.Producto;
import com.softtek.web.app.entity.usuario.Usuario;

public interface ProductoService {
	
	public List<Producto> findAll();
	
	public void save(Producto producto);


}
