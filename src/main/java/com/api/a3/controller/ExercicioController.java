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

import com.api.a3.dto.CategoriaDTO;
import com.api.a3.dto.ExercicioDTO;
import com.api.a3.services.CategoriaService;
import com.api.a3.services.ExercicioService;

@RequestMapping("/exercicio")
@RestController
public class ExercicioController {
	
	@Autowired
	ExercicioService service;
	
	@Autowired
	CategoriaService categoriaservice;
	
	@PostMapping
	public ResponseEntity<String> cadastrarExercicio (@RequestBody ExercicioDTO dto){
		if (dto != null) {
			service.cadastrarExercicio(dto);
			return ResponseEntity.ok("Exercicio cadastrado com sucesso.");
		}
		return null;
	}
	
	@GetMapping
	public ResponseEntity<List<ExercicioDTO>> listarExercicios (){
		return ResponseEntity.ok(service.listarExcercicios());
	}
	
	@GetMapping("id/{id}")
	public ResponseEntity<ExercicioDTO> buscarExercicio (@PathVariable Long id){
		return ResponseEntity.ok(service.buscarExercicio(id));	
	}
	
	@DeleteMapping("id/{id}")
	public ResponseEntity<String> deletarExercicio (@PathVariable Long id){
		if(id != null) {
		   service.deletarExercicio(id);
		   return ResponseEntity.ok("Exercicio deletado com sucesso.");
		}
		return null;
	}
	
	@PostMapping("/categoria")
	public ResponseEntity<String> cadastrarCategoria (@RequestBody CategoriaDTO dto){
		categoriaservice.cadastrarCategoria(dto);
		return ResponseEntity.ok("Categoria cadastrada com sucesso.");
	}
	
	@GetMapping("/categoria")
	public ResponseEntity<List<CategoriaDTO>> listarCategorias (){
		return ResponseEntity.ok(categoriaservice.listarCategorias());
	}
	
	@GetMapping("/categoria/id/{id}")
	public ResponseEntity<CategoriaDTO> buscarCategoria (@PathVariable Long id){
		return ResponseEntity.ok(categoriaservice.listarCategoria(id));
	}
	
	@DeleteMapping("/categoria/id/{id}")
	public ResponseEntity<String> deletarCategoria (@PathVariable Long id){
		if( id != null) {
			categoriaservice.deletarCategoriaId(id);
			return ResponseEntity.ok("Categoria deletada.");
		}
		return null;
	}
}
