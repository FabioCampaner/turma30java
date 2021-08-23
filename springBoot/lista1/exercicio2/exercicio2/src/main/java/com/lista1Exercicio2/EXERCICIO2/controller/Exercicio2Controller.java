package com.lista1Exercicio2.EXERCICIO2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exercicio2")
public class Exercicio2Controller {
	
	@GetMapping
	public String resposta() {
		return "<b>Objetivos de Aprendizagem</b><br><br>Aprender a utilizar o Spring Boot para fazer a interação back-end com a internet aconteça!";
	}
}
