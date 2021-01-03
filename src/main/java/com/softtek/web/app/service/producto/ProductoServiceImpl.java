package com.softtek.web.app.service.producto;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.softtek.web.app.entity.producto.Producto;
import com.softtek.web.app.repository.producto.ProductoRepository;
import com.softtek.web.app.repository.producto.ProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoService {
	
	@Autowired
	ProductoRepository productoRepository;

	@Override
	@Transactional(readOnly =  true)
	public List<Producto> findAll() {	
		return (List<Producto>) productoRepository.findAll();
	}

	@Override
	@Transactional(readOnly =  true)
	public Producto findById(Integer id) {
		return productoRepository.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Producto save(Producto producto) {
		return productoRepository.save(producto);
	}

	@Override
	@Transactional
	public void delete(Integer id) {
		productoRepository.deleteById(id);
		
	}
	
		
}
