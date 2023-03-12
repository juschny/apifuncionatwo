package com.jcode.CrudSpring.repository;

import com.jcode.CrudSpring.model.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Long> {



}
