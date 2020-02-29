package com.distribuida.usuario.util;

import javax.persistence.TypedQuery;

import com.distribuida.usuario.db.Usuario;
import com.distribuida.usuario.dto.UsuarioDto;

public class UsuarioUtil {

	public UsuarioDto dto( TypedQuery<Usuario> qry ) {
		
		Usuario s = qry.getSingleResult();

		UsuarioDto dto = new UsuarioDto();

		dto.setId(s.getId());
		dto.setName(s.getName());
		dto.setUsername(s.getUsername());
		dto.setEmail(s.getEmail());

		return dto;
		
	}
	
	
	public Usuario s( UsuarioDto user ) {
		
		Usuario s = new Usuario();
		
		s.setId( user.getId() );
		s.setName( user.getName() );
		s.setUsername( user.getUsername() );
		s.setEmail( user.getEmail() );
		
		return s;
	}
	
	
	
	
	
}
