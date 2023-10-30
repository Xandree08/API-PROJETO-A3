package com.api.a3.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.a3.dto.ExercicioDTO;
import com.api.a3.model.Exercicio;
import com.api.a3.repository.ExercicioRepository;

@Service
public class ExercicioService {
	
	
	@Autowired
	ExercicioRepository repository;
	
	// Listar todos os exercicios
	public List<ExercicioDTO> listarExcercicios() {
	List<Exercicio> lista = repository.findAll();
		return lista.stream().map(ExercicioDTO::convert).collect(Collectors.toList());
	}
	// Cadastrar um exercicio
	public void cadastrarExercicio (ExercicioDTO dto) {
		if(dto.getCategoria().getCategoria() != null) {
	    repository.save(Exercicio.convert(dto));
		}
	}
	//Listar exercicio por id
	public ExercicioDTO buscarExercicio (Long id) {
		Optional<Exercicio> ex = repository.findById(id);
		if(ex.isPresent()) {
			return ExercicioDTO.convert(ex.get());
		}
		return null;
	}
	//Deletar exercicio por id 
	public void deletarExercicio (Long id) {
		Optional<Exercicio> ex = repository.findById(id);
		if(ex.isPresent()) {
		repository.deleteById(id);
		}
	}

}
