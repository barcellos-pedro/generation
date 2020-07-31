package com.atividadespring.MinhaEscolaV2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atividadespring.MinhaEscolaV2.model.Aluno;
import com.atividadespring.MinhaEscolaV2.repository.AlunoRepository;

@RestController
@RequestMapping("/alunos")
@CrossOrigin("*")
public class AlunoController {
	
	@Autowired
	private AlunoRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Aluno>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Aluno> GetById(@PathVariable Long id){
		return repository.findById(id).map(response -> ResponseEntity.ok(response)).orElse(ResponseEntity.notFound().build());
	}
	
	@PostMapping("/criar-aluno")
	public ResponseEntity<Aluno> Post(@RequestBody Aluno aluno){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(aluno));
	}
	
	@PutMapping("/atualizar-aluno")
	public ResponseEntity<Aluno> Put(@RequestBody Aluno aluno){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(aluno));
	}
	
	@DeleteMapping("/excluir-aluno/{id}")
	public void Delete(@PathVariable long id) {
		repository.deleteById(id);
	}
}
