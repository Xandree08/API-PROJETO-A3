package com.api.a3.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.api.a3.dto.PerfilDTO;
import com.api.a3.model.Perfil;
import com.api.a3.repository.PerfilRepository;

@Service
public class PerfilService {

	@Autowired
	PerfilRepository repository;
	
	public void cadastrarPerfil (PerfilDTO dto) {
		if (dto != null) {
			repository.save(Perfil.convert(dto));
		}
	}

	public List<PerfilDTO> listarPerfis(){
		List<Perfil> lista = repository.findAll();
		return lista.stream().map(PerfilDTO::convert).collect(Collectors.toList());
	}
	
	
}
