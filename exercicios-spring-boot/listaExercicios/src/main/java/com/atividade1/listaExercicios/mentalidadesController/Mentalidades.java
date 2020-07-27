package com.atividade1.listaExercicios.mentalidadesController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mentalidades")
public class Mentalidades {
	@GetMapping
	public String mentalidades() {
		return "Atenção aos detalhes, Mentalidade de crescimento e Persistência.";
	}
}
