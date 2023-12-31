package com.api.a3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.a3.model.Perfil;

@Repository
public interface PerfilRepository extends JpaRepository<Perfil, Long>{

}
