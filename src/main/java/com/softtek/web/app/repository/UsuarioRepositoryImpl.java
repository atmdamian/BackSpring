package com.softtek.web.app.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.softtek.web.app.entity.usuario.Usuario;

@Repository
public class UsuarioRepositoryImpl implements UsuarioRepository {

	@PersistenceContext
	EntityManager entityManager;

	@Override
	@Transactional
	public void save(Usuario usuario) {		
		try {		
			entityManager.persist(usuario);		
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Transactional(readOnly = true)
	@Override
	public List<Usuario> findAll() {
		try {
			TypedQuery<Usuario> query = entityManager.createNamedQuery("find_all_usuarios", Usuario.class);
			return query.getResultList();
		} catch (javax.persistence.NoResultException ex) {
			return null;
		} 
	}

	@Override
	@Transactional(readOnly = true)
	public List<Usuario> findByUsuario(String usuario) {
		try {
			TypedQuery<Usuario> query = entityManager.createNamedQuery("find_by_usuario", Usuario.class);
			query.setParameter("usuario", usuario);
			return query.getResultList();
		} catch (javax.persistence.NoResultException ex) {
			return null;
		}

	}

	@Override
	@Transactional
	public void delete(Integer idUsuario) {
		try {
			Usuario usuario = entityManager.find(Usuario.class, idUsuario);
			entityManager.remove(usuario);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
