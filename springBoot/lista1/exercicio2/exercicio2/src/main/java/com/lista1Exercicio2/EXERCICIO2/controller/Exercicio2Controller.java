package com.lista1Exercicio2.EXERCICIO2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Exercicio2Controller {
	@RequestMapping("/exercicio2")
	public String resposta() {
		return "<b>Objetivos de Aprendizagem</b><br><br>Aprender a utilizar o Spring Boot para fazer a interação back-end com a internet aconteça!";
	}
}
