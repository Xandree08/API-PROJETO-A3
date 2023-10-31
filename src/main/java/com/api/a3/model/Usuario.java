package com.api.a3.model;

import com.api.a3.dto.UsuarioDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotBlank
	private String usuario;
	@NotBlank
	private String email;
	@NotBlank
	private String senha;
	
	@OneToOne
	private Perfil perfil;
	
	
	
	public static Usuario convert (UsuarioDTO dto){
		
		Usuario us = new Usuario();
		us.setEmail(dto.getEmail());
		us.setId(dto.getId());
		us.setPerfil(dto.getPerfil());
		us.setSenha(dto.getSenha());
		us.setUsuario(dto.getUsuario());
		
		return us;
	}
}
