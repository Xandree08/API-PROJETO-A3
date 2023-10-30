package com.api.a3.model;

import com.api.a3.dto.ExercicioDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Exercicio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String exercicio;
	private String descricao;
	private Categoria categoria;
	
	
	public static Exercicio convert (ExercicioDTO dto) {
		
		Exercicio ex = new Exercicio();
		ex.setCategoria(dto.getCategoria());
		ex.setDescricao(dto.getDescricao());
		ex.setExercicio(dto.getExercicio());
		ex.setId(dto.getId());
		
		return ex;
	}
}
