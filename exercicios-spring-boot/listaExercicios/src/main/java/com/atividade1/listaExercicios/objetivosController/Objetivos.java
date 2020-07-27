package com.atividade1.listaExercicios.objetivosController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos")
public class Objetivos {
	@GetMapping
	public String objetivos() {
		return "Meus objetivos de aprendizagem para esta semana: Aprender a utlizar o Spring para poder já começar a criar um protópio funcional do projeto integrador.";
	}
}
