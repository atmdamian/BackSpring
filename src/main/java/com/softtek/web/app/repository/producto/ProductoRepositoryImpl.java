package com.softtek.web.app.repository.producto;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.softtek.web.app.entity.producto.Producto;

@Repository
public class ProductoRepositoryImpl  implements ProductoRepository{
 
	@PersistenceContext
	EntityManager entityManager;
	
	
	@Transactional(readOnly = true)
	@Override
	public List<Producto> findAll() {
		TypedQuery<Producto> query = entityManager.createNamedQuery("find_all_productos", Producto.class);
		entityManager.close();
		return query.getResultList();
	}
	
	

}
