package com.atividadespring.MinhaEscolaV2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atividadespring.MinhaEscolaV2.model.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long>{
	public List<Aluno> findAllByNomeContainingIgnoreCase(String nome);
}
