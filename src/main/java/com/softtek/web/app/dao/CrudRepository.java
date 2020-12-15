package com.softtek.web.app.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public abstract class CrudRepository<T, K> {
	@PersistenceContext
	private EntityManager entityManager;

	public CrudRepository(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public abstract T find(K id);
	
	public abstract List<T> findAll();

	public T create(T t) {
		checkTransaction();
		entityManager.persist(t);
		entityManager.flush();
		entityManager.refresh(t);
		return t;
	}

	public T update(T t) {
		checkTransaction();
		return (T) entityManager.merge(t);
	}

	public void delete(T t) {
		checkTransaction();
		t = entityManager.merge(t);
		entityManager.remove(t);
	}

	private void checkTransaction() {
		if (!entityManager.getTransaction().isActive())
			throw new RuntimeException("Transacción inactiva");
	}

}
