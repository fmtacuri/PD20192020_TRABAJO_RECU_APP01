package com.distribuida.usuario.dto;

import lombok.Getter;
import lombok.Setter;

public class UsuarioDto {
	
	@Getter @Setter private Integer id;
	@Getter @Setter private String name;
	@Getter @Setter private String username;
	@Getter @Setter private String email;
	
}
