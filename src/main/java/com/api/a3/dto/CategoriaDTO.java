package com.api.a3.dto;

import com.api.a3.model.Categoria;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CategoriaDTO {

	private Long id;
	
	private String categoria;
	
	
	// Converter a categoria em dto
	public static CategoriaDTO convert (Categoria categoria) {
		CategoriaDTO dto = new CategoriaDTO();
		dto.setCategoria(categoria.getCategoria());
		dto.setId(categoria.getId());
		return dto;
	}
	
	
}
