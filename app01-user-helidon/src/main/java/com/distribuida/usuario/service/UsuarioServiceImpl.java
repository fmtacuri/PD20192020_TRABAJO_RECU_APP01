package com.distribuida.usuario.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import com.distribuida.usuario.db.Usuario;
import com.distribuida.usuario.dto.UsuarioDto;
import com.distribuida.usuario.util.UsuarioUtil;

@ApplicationScoped
@Transactional
public class UsuarioServiceImpl implements UsuarioService {

	@PersistenceContext
	private EntityManager em;

	@Inject
	UsuarioUtil utilUsuario;

	@Override
	public UsuarioDto findById(Integer id) {

		TypedQuery<Usuario> qry = em.createQuery("select o from Usuario o where o.id=:id", Usuario.class);
		qry.setParameter("id", id);

		UsuarioDto dto = utilUsuario.dto(qry);

		return dto;
	}

	@Override
	public List<UsuarioDto> findAll() {
		TypedQuery<Usuario> qry = em.createQuery("select o from Usuario o order by o.id asc", Usuario.class);

		List<UsuarioDto> ret = qry.getResultList().stream().map(s -> {
			UsuarioDto dto = new UsuarioDto();

			dto.setId(s.getId());
			dto.setName(s.getName());
			dto.setUsername(s.getUsername());
			dto.setEmail(s.getEmail());

			return dto;
		}).collect(Collectors.toList());

		return ret;
	}

}
