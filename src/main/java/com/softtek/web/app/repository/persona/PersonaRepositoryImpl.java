package com.softtek.web.app.repository.persona;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.softtek.web.app.model.Persona;

@Repository
public class PersonaRepositoryImpl implements PersonaRepository{
	
	@PersistenceContext
	EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	@Override
	public List<Persona> findAll() {
		try {
			Query query= entityManager.createQuery("SELECT p FROM Persona p");
			return query.getResultList();
		} catch (javax.persistence.NoResultException ex) {
			return null;
		}		
	}

}
