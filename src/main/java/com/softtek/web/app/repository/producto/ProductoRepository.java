package com.softtek.web.app.repository.producto;

import java.util.List;

import com.softtek.web.app.entity.producto.Producto;
import com.softtek.web.app.entity.usuario.Usuario;

public interface ProductoRepository {
	
	public List<Producto> findAll();
	
	public void save(Producto producto);


}
