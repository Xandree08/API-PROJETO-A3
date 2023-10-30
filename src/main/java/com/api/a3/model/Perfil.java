package com.api.a3.model;

import com.api.a3.dto.PerfilDTO;

import jakarta.persistence.Entity;
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
@Entity
public class Perfil {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	private String cpf;
	@NotBlank
	private String nome;
	@NotBlank
	private String sobrenome;
	
	private Double altura;
	private Double peso;
	
	
	public static Perfil convert (PerfilDTO dto) {
		
		Perfil perfil = new Perfil();
		perfil.setAltura(dto.getAltura());
		perfil.setCpf(perfil.getCpf());
		perfil.setId(perfil.getId());
		perfil.setNome(perfil.getNome());
		perfil.setPeso(perfil.getPeso());
		perfil.setSobrenome(perfil.getSobrenome());
		
		return perfil;
		
	}
}
