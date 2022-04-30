package com.kruger.challenge.repository;

import java.util.Optional;
import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kruger.challenge.entity.Usuarios;
@Repository
public interface UsuariosRepository extends CrudRepository<Usuarios, Long > {
	
	
	
	//public Optional findByUsername(String username);

	public Iterable<Usuarios> findAllById(String estadovacunacion);
	
	//public Optional findByIdAndPassword(Long id, String password);
	

}
