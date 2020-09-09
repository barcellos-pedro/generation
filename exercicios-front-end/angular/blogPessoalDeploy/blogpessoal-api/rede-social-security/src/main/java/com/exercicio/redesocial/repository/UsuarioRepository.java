package com.exercicio.redesocial.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exercicio.redesocial.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	public List<Usuario> findAllByNomeContainingIgnoreCase(String nome);
	public Optional<Usuario> findByUsuario(String usuario);
}
