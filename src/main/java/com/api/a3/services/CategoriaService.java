package com.api.a3.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.a3.dto.CategoriaDTO;
import com.api.a3.model.Categoria;
import com.api.a3.repository.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	CategoriaRepository repository;
	
	public void cadastrarCategoria (CategoriaDTO dto) {
		if(dto != null) {
		repository.save(Categoria.convert(dto));
		}
	}
	
	public List<CategoriaDTO> listarCategorias (){
		List<Categoria> lista = repository.findAll();
		return lista.stream().map(CategoriaDTO::convert).collect(Collectors.toList());
	}

	public void deletarCategoriaId (Long id) {
		Optional<Categoria> categoria = repository.findById(id);
		if(categoria.isPresent()) {
			repository.deleteById(id);
		}
	}
	
	public CategoriaDTO listarCategoria (Long id) {
		Optional<Categoria> categoria = repository.findById(id);
		return CategoriaDTO.convert(categoria.get());
	}
	
}
