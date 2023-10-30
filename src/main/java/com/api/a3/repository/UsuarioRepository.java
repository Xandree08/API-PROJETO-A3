package com.api.a3.repository;

import org.apache.catalina.authenticator.SavedRequest;
import org.springframework.data.jpa.repository.JpaRepository;

import com.api.a3.dto.UsuarioDTO;
import com.api.a3.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario , Long> {

	
}
