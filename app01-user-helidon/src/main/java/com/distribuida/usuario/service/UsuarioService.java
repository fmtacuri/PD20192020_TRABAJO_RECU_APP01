package com.distribuida.usuario.service;

import java.util.List;

import com.distribuida.usuario.db.Usuario;

public interface UsuarioService {
	
	//Listo
	public Usuario findById(Integer id);
	
	// Listo
	public List<Usuario> findAll( );
}
