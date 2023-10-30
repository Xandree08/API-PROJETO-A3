package com.api.a3.dto;

import com.api.a3.model.Perfil;
import com.api.a3.model.Usuario;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UsuarioDTO {

	
	private Long id;
	private String usuario;
	private String email;
	private String senha;
	private Perfil perfil;
	
	
	public static UsuarioDTO convert (Usuario usuario) {
		
		UsuarioDTO dto = new UsuarioDTO();
		dto.setEmail(usuario.getEmail());
		dto.setId(usuario.getId());
		dto.setPerfil(usuario.getPerfil());
		dto.setSenha(usuario.getSenha());
		dto.setUsuario(usuario.getUsuario());
		
		return dto;
	}
	
	
}

