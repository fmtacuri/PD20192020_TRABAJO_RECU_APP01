package com.distribuida.usuario.service;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import com.distribuida.usuario.db.Usuario;

@ApplicationScoped
@Transactional
public class UsuarioServiceImpl implements UsuarioService {

	@PersistenceContext
	private EntityManager em;

	@Override
	public Usuario findById(Integer id) {
		Usuario Usuario = em.find(Usuario.class, id);
		return Usuario;
	}

	@Override
	public List<Usuario> findAll() {
		TypedQuery<Usuario> query = em.createQuery("Select e from Usuario e", Usuario.class);
		List<Usuario> Usuario = query.getResultList();
		return Usuario;
	}

}
