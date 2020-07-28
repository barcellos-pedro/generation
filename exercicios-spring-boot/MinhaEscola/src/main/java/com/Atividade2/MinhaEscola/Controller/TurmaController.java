package com.Atividade2.MinhaEscola.Controller;

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

import com.Atividade2.MinhaEscola.Model.Turma;
import com.Atividade2.MinhaEscola.Repository.TurmaRepository;

@RestController
@RequestMapping("/turmas")
@CrossOrigin("*")
public class TurmaController {
	
	@Autowired
	private TurmaRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Turma>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Turma> GetById(@PathVariable Long id){
		return repository.findById(id).map(response -> ResponseEntity.ok(response)).orElse(ResponseEntity.notFound().build());
	}
	
	@PostMapping("/criar-turma")
	public ResponseEntity<Turma> Post(@RequestBody Turma turma){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(turma));
	}
	
	@PutMapping("/atualizar-turma")
	public ResponseEntity<Turma> Put(@RequestBody Turma turma){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(turma));
	}
	
	@DeleteMapping("/excluir-turma/{id}")
	public void Delete(@PathVariable long id) {
		repository.deleteById(id);
	}
}
