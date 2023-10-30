package com.api.a3.model;

import com.api.a3.dto.CategoriaDTO;

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
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotBlank
	private String categoria;
	
	

	public static Categoria convert (CategoriaDTO dto) {
		
		Categoria categoria = new Categoria();
		categoria.setCategoria(dto.getCategoria());
		categoria.setId(dto.getId());
		
		return categoria;
	}
}
