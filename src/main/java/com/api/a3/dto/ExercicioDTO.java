package com.api.a3.dto;

import com.api.a3.model.Categoria;
import com.api.a3.model.Exercicio;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ExercicioDTO {

	private Long id;
	private String exercicio;
	private String videoUri;
	private Categoria categoria;
	
	
	public static ExercicioDTO convert (Exercicio ex) {
		ExercicioDTO dto = new ExercicioDTO();
		
		dto.setCategoria(ex.getCategoria());
		dto.setVideoUri(ex.getVideoUri());
		dto.setExercicio(ex.getExercicio());
		dto.setId(ex.getId());
		return dto;
	}
	
}
