package com.Atividade2.MinhaEscola.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Atividade2.MinhaEscola.Model.Turma;

@Repository
public interface TurmaRepository extends JpaRepository<Turma, Long>{
	public List<Turma> findAllByTurmaContainingIgnoreCase(String turma);
}
