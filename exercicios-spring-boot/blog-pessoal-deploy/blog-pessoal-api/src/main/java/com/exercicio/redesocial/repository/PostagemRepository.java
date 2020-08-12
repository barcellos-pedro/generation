package com.exercicio.redesocial.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exercicio.redesocial.model.Postagem;

public interface PostagemRepository extends JpaRepository<Postagem, Long>{
	public List<Postagem> findAllByDescricaoContainingIgnoreCase(String descricao);
}
