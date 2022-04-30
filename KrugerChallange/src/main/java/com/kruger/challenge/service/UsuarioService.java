package com.kruger.challenge.service;

import java.util.List;

import com.kruger.challenge.entity.Usuarios;

public interface UsuarioService {
	
	public Iterable<Usuarios> getAllUsuarios();
	public Iterable<Usuarios> findAllByEstadovacunacion(String Estadovacunacion); 
	
	

}
