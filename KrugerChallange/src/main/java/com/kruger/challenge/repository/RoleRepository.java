package com.kruger.challenge.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kruger.challenge.entity.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long>{

}
