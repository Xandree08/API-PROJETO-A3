package com.api.a3.dto;

import com.api.a3.model.Perfil;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PerfilDTO {
	
	private Long id;
	private String cpf;
	private String nome;
	private String sobrenome;	
	private Double altura;
	private Double peso;
	
	
	public static PerfilDTO convert (Perfil perfil) {
		PerfilDTO dto = new PerfilDTO();
		dto.setAltura(perfil.getAltura());
		dto.setCpf(perfil.getCpf());
		dto.setId(perfil.getId());
		dto.setNome(perfil.getNome());
		dto.setPeso(perfil.getPeso());
		dto.setSobrenome(perfil.getSobrenome());
		return dto;
	}
}
