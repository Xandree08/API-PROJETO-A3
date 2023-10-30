package com.api.a3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.a3.dto.ExercicioDTO;
import com.api.a3.dto.UsuarioDTO;
import com.api.a3.repository.ExercicioRepository;
import com.api.a3.services.ExercicioService;
import com.api.a3.services.UsuarioService;

import jakarta.websocket.server.PathParam;

@RequestMapping("/user")
@RestController
public class UsuarioController {
	
	@Autowired
	UsuarioService service;

	@PostMapping
	public ResponseEntity<String> cadastrarUsuario (@RequestBody UsuarioDTO dto){
		service.cadastrarUsuario(dto);
		if(dto != null) {
			return ResponseEntity.ok("Cadastrado com sucesso !");
		}
		return null;
	}
	
	@GetMapping
	public ResponseEntity<List<UsuarioDTO>> listarUsuarios(){
		return ResponseEntity.ok(service.listarUsuarios());
	}
	
	@GetMapping("id/{id}")
	public ResponseEntity<UsuarioDTO> listarUsuario (@PathVariable Long id){
		return ResponseEntity.ok(service.listarUsuario(id));
	}
	
	@DeleteMapping("id/{id}")
	public ResponseEntity<String> deletarUsuario (@PathVariable Long id){
		if(id != null) {
			service.deletarUsuario(id);
			return ResponseEntity.ok("Usuario deletado");
		}
		return null;
	}
}
