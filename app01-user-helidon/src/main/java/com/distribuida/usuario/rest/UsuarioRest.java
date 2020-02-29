package com.distribuida.usuario.rest;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.distribuida.usuario.dto.UsuarioDto;
import com.distribuida.usuario.service.UsuarioService;

@Path("/users")
@Produces("application/json")
@Consumes("application/json")
@ApplicationScoped
public class UsuarioRest {
	
	@PersistenceContext 
	private EntityManager em;
	
	@Inject
	UsuarioService service;
	
	@GET
	public List<UsuarioDto> findAll( ) {
		return service.findAll();
	}
	
	@GET
	@Path("/{id}")
	public UsuarioDto findById( @PathParam(value = "id") Integer id ) {
		return service.findById(id);
	}

}
