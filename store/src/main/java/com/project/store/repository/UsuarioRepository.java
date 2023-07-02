package com.project.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.project.store.entity.Usuario;


public interface UsuarioRepository extends JpaRepository<Usuario,Long>{
	
	Usuario findByLogin(String login);
}
