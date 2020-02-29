package com.distribuida.usuario.db;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table( name = "Usuario" )
public class Usuario {
	
	@Id
	@Column(name="id")
	@Getter @Setter private Integer id;
	
	@Column(name="name")
	@Getter @Setter private String name;

	@Column(name="username")
	@Getter @Setter private String username;
	
	@Column(name="email")
	@Getter @Setter private String email;
	
}
