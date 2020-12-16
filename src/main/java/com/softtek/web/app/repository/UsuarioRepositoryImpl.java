package com.softtek.web.app.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
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
		// entityManager.persist(usuario.getResultado());
		EntityTransaction transaction = entityManager.getTransaction();
		try {
			transaction.begin();
			entityManager.persist(usuario);
			transaction.commit();
			entityManager.refresh(usuario);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			entityManager.close();
		}

		// entityManager.refresh(usuario);

	}

	@Transactional(readOnly = true)
	@Override
	public List<Usuario> findAll() {
		entityManager.clear();
		entityManager.flush();

		try {
			TypedQuery<Usuario> query = entityManager.createNamedQuery("find_all_usuarios", Usuario.class);
			entityManager.close();
			return query.getResultList();
		} catch (javax.persistence.NoResultException ex) {
			return null;
		} finally {
			entityManager.close();
		}
	}

	@Override
	@Transactional(readOnly = true)
	public List<Usuario> findByUsuario(String usuario) {
		entityManager.clear();
		entityManager.flush();
		try {
			TypedQuery<Usuario> query = entityManager.createNamedQuery("find_by_usuario", Usuario.class);
			query.setParameter("usuario", usuario);
			return query.getResultList();
		} catch (javax.persistence.NoResultException ex) {
			return null;
		} finally {
			entityManager.close();
		}

	}

	@Override
	@Transactional
	public void delete(Integer idUsuario) {
		EntityTransaction transaction = entityManager.getTransaction();

		try {
			transaction.begin();
			Usuario usuario = entityManager.find(Usuario.class, idUsuario);
			entityManager.remove(usuario);
			transaction.commit();
			entityManager.refresh(usuario);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			entityManager.close();
		}
	}

}
