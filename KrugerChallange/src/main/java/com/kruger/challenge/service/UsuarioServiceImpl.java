package com.kruger.challenge.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kruger.challenge.entity.Usuarios;
import com.kruger.challenge.repository.UsuariosRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService {
	@Autowired
	
	UsuariosRepository repository;
	@Override
	public Iterable<Usuarios> getAllUsuarios() {
		return repository.findAll();
		
	}
	@Override
	public Iterable<Usuarios> findAllByEstadovacunacion(String Estadovacunacion) {
		return repository.findAllById(Estadovacunacion);
	}
	

}
