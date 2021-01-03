package com.softtek.web.app.repository;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.softtek.web.app.entity.usuario.Usuario;
import com.softtek.web.app.model.UsuarioDomicilio;

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
	public Usuario findByUsuario(String nombreUsuario) {
		try {
			 return entityManager.createNamedQuery("find_by_usuario", Usuario.class)
					 .setParameter("usuario", nombreUsuario).getSingleResult();
			
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

	@Override
	public List<Usuario> findAllWhitDomicilio() {
		try {
			TypedQuery<Usuario> query = entityManager.createNamedQuery("find_all_usuario_domicilio", Usuario.class);
			return query.getResultList();
		} catch (javax.persistence.NoResultException ex) {
			return null;
		}
	}

}
