package com.distribuida.usuario.service;

import java.util.List;

import com.distribuida.usuario.dto.UsuarioDto;

public interface UsuarioService {
	
	//Listo
	public UsuarioDto findById(Integer id);
	
	// Listo
	public List<UsuarioDto> findAll( );
}
