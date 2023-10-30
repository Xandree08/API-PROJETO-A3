package com.api.a3.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.a3.dto.ExercicioDTO;
import com.api.a3.dto.UsuarioDTO;
import com.api.a3.model.Exercicio;
import com.api.a3.model.Usuario;
import com.api.a3.repository.UsuarioRepository;



@Service
public class UsuarioService {

	@Autowired
	UsuarioRepository repository;
	
	//Cadastrar o usuário
	public void cadastrarUsuario (UsuarioDTO dto) {
	repository.save(Usuario.convert(dto));
	}
	
	//Listar todos usuários
	public List<UsuarioDTO> listarUsuarios (){
	List<Usuario> lista = repository.findAll();	
	return lista.stream().map(UsuarioDTO::convert).collect(Collectors.toList());
	}
	
	//Listar usuario pelo id
	public UsuarioDTO listarUsuario(Long id) {
		Optional <Usuario> usuario = repository.findById(id);
		return UsuarioDTO.convert(usuario.get());
	}
	
	//Deletar usuario pelo id
	public void deletarUsuario(Long id) {
		Optional <Usuario> usuario = repository.findById(id);
		if(usuario.isPresent()) {
			repository.delete(usuario.get());
		}
	}
}
